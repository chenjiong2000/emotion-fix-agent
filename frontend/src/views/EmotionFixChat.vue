<template>
  <div class="chat-page">
    <!-- 顶部导航栏 -->
    <header class="chat-header">
      <button class="back-btn" @click="goHome">
        <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
          <path d="M13 4l-6 6 6 6" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
        </svg>
      </button>
      <div class="header-info">
        <div class="avatar-wrapper">
          <span class="avatar">🌉</span>
          <span class="online-dot"></span>
        </div>
        <div class="header-text">
          <h1 class="chat-title">AI 心桥</h1>
          <span class="chat-status">{{ isStreaming ? '正在输入...' : '在线' }}</span>
        </div>
      </div>
      <div class="header-actions">
        <button class="action-btn" title="新建对话" @click="newChat">
          <svg width="18" height="18" viewBox="0 0 18 18" fill="none">
            <path d="M9 3v12M3 9h12" stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
          </svg>
        </button>
      </div>
    </header>

    <!-- 会话 ID 信息栏 -->
    <div class="session-bar">
      <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
        <path d="M7 1a6 6 0 100 12A6 6 0 007 1z" stroke="currentColor" stroke-width="1.2"/>
        <path d="M7 6v4M7 4.5v.5" stroke="currentColor" stroke-width="1.2" stroke-linecap="round"/>
      </svg>
      <span>会话 ID：{{ chatId }}</span>
    </div>

    <!-- 聊天消息区域 -->
    <main class="messages-area" ref="messagesArea">
      <!-- 欢迎消息 -->
      <div v-if="messages.length === 0" class="welcome-section">
        <div class="welcome-avatar">🌉</div>
        <h2 class="welcome-title">你好，我是 AI 心桥</h2>
        <p class="welcome-desc">懂你心事，陪你前行。<br/>无论是家庭关系、职场人际还是友情困境，<br/>我都愿意倾听并给你最真诚的建议 🤝</p>
        <div class="suggestion-chips">
          <button
            v-for="tip in suggestions"
            :key="tip"
            class="chip"
            @click="sendSuggestion(tip)"
          >{{ tip }}</button>
        </div>
      </div>

      <!-- 消息列表 -->
      <transition-group name="message" tag="div" class="messages-list">
        <div
          v-for="msg in messages"
          :key="msg.id"
          class="message-row"
          :class="msg.role === 'user' ? 'user-row' : 'ai-row'"
        >
          <!-- AI 头像 -->
          <div v-if="msg.role === 'ai'" class="msg-avatar ai-avatar">🌉</div>

          <div class="bubble-wrapper" :class="msg.role === 'user' ? 'user-bubble-wrapper' : 'ai-bubble-wrapper'">
            <div
              class="bubble"
              :class="[msg.role === 'user' ? 'user-bubble' : 'ai-bubble', msg.isStreaming ? 'streaming' : '']"
            >
              <span class="bubble-text" v-html="formatMessage(msg.content)"></span>
              <span v-if="msg.isStreaming" class="cursor-blink">▋</span>
            </div>
            <span class="msg-time">{{ msg.time }}</span>
          </div>

          <!-- 用户头像 -->
          <div v-if="msg.role === 'user'" class="msg-avatar user-avatar">👤</div>
        </div>
      </transition-group>

      <!-- 底部占位，保证滚动到底 -->
      <div ref="bottomAnchor" style="height: 1px;"></div>
    </main>

    <!-- 底部输入区域 -->
    <footer class="input-area">
      <div class="input-wrapper">
        <textarea
          ref="inputRef"
          v-model="inputText"
          class="message-input"
          placeholder="向 AI 心桥倾诉你的心事..."
          :disabled="isStreaming"
          rows="1"
          @keydown.enter.exact.prevent="sendMessage"
          @input="autoResize"
        ></textarea>
        <button
          class="send-btn"
          :class="{ active: inputText.trim() && !isStreaming, loading: isStreaming }"
          :disabled="!inputText.trim() || isStreaming"
          @click="sendMessage"
        >
          <svg v-if="!isStreaming" width="20" height="20" viewBox="0 0 20 20" fill="none">
            <path d="M17 10L3 3l3 7-3 7 14-7z" fill="currentColor"/>
          </svg>
          <div v-else class="loading-dots">
            <span></span><span></span><span></span>
          </div>
        </button>
      </div>
      <p class="input-hint">Enter 发送 · 支持 SSE 流式输出</p>
    </footer>
  </div>
</template>

<script setup>
import { ref, nextTick, onMounted } from 'vue'
import { useRouter } from 'vue-router'
import { doChatWithEmotionFixAgentSSE } from '@/api/chatApi'

const router = useRouter()

// 会话 ID
const chatId = ref('')
const messages = ref([])
const inputText = ref('')
const isStreaming = ref(false)
const messagesArea = ref(null)
const bottomAnchor = ref(null)
const inputRef = ref(null)

const suggestions = [
  '和室友发生了矛盾，该怎么修复关系？',
  '朋友总是忽视我的感受，我该怎么办？',
  '职场中如何与难相处的同事打交道？',
  '家人总是不理解我，如何改善沟通？'
]

function generateChatId() {
  return 'chat_' + Date.now() + '_' + Math.random().toString(36).slice(2, 8)
}

function formatTime() {
  const now = new Date()
  const h = String(now.getHours()).padStart(2, '0')
  const m = String(now.getMinutes()).padStart(2, '0')
  return `${h}:${m}`
}

function formatMessage(text) {
  return text
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/\n/g, '<br/>')
}

async function scrollToBottom() {
  await nextTick()
  bottomAnchor.value?.scrollIntoView({ behavior: 'smooth' })
}

function autoResize(e) {
  const el = e.target
  el.style.height = 'auto'
  el.style.height = Math.min(el.scrollHeight, 160) + 'px'
}

function resetInputHeight() {
  if (inputRef.value) {
    inputRef.value.style.height = 'auto'
  }
}

function newChat() {
  chatId.value = generateChatId()
  messages.value = []
}

function goHome() {
  router.push('/')
}

async function sendSuggestion(text) {
  inputText.value = text
  await sendMessage()
}

async function sendMessage() {
  const text = inputText.value.trim()
  if (!text || isStreaming.value) return

  // 添加用户消息
  messages.value.push({
    id: Date.now(),
    role: 'user',
    content: text,
    time: formatTime(),
    isStreaming: false
  })

  inputText.value = ''
  resetInputHeight()
  await scrollToBottom()

  // 创建 AI 消息占位
  const aiMsgId = Date.now() + 1
  messages.value.push({
    id: aiMsgId,
    role: 'ai',
    content: '',
    time: formatTime(),
    isStreaming: true
  })

  isStreaming.value = true
  await scrollToBottom()

  const aiMsg = messages.value.find(m => m.id === aiMsgId)

  try {
    await doChatWithEmotionFixAgentSSE(
      text,
      chatId.value,
      (chunk) => {
        if (aiMsg) {
          aiMsg.content += chunk
          scrollToBottom()
        }
      }
    )
  } catch (err) {
    if (aiMsg) {
      aiMsg.content = aiMsg.content || '抱歉，发生了一些错误，请稍后重试 😢'
    }
    console.error('SSE 请求失败:', err)
  } finally {
    if (aiMsg) {
      aiMsg.isStreaming = false
    }
    isStreaming.value = false
    await scrollToBottom()
  }
}

onMounted(() => {
  chatId.value = generateChatId()
  inputRef.value?.focus()
})
</script>

<style scoped>
.chat-page {
  height: 100vh;
  display: flex;
  flex-direction: column;
  background: var(--bg);
  position: relative;
}

/* 顶部导航栏 */
.chat-header {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 16px 20px;
  background: var(--bg-card);
  border-bottom: 1px solid var(--border);
  z-index: 10;
  flex-shrink: 0;
}

.back-btn {
  width: 36px;
  height: 36px;
  border: none;
  background: rgba(255, 255, 255, 0.06);
  border-radius: 10px;
  color: var(--text-primary);
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: background 0.2s;
  flex-shrink: 0;
}

.back-btn:hover {
  background: rgba(255, 107, 157, 0.15);
  color: var(--primary);
}

.header-info {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 12px;
}

.avatar-wrapper {
  position: relative;
}

.avatar {
  font-size: 32px;
  line-height: 1;
}

.online-dot {
  position: absolute;
  bottom: 2px;
  right: -2px;
  width: 10px;
  height: 10px;
  background: #2ed573;
  border-radius: 50%;
  border: 2px solid var(--bg-card);
  animation: pulse-dot 2s ease-in-out infinite;
}

@keyframes pulse-dot {
  0%, 100% { box-shadow: 0 0 0 0 rgba(46, 213, 115, 0.4); }
  50% { box-shadow: 0 0 0 4px rgba(46, 213, 115, 0); }
}

.header-text {
  display: flex;
  flex-direction: column;
  gap: 2px;
}

.chat-title {
  font-size: 17px;
  font-weight: 700;
  color: var(--text-primary);
}

.chat-status {
  font-size: 12px;
  color: #2ed573;
}

.header-actions {
  display: flex;
  gap: 8px;
}

.action-btn {
  width: 36px;
  height: 36px;
  border: none;
  background: rgba(255, 255, 255, 0.06);
  border-radius: 10px;
  color: var(--text-secondary);
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.2s;
}

.action-btn:hover {
  background: rgba(255, 107, 157, 0.15);
  color: var(--primary);
}

/* 会话信息栏 */
.session-bar {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 8px 20px;
  background: rgba(255, 107, 157, 0.05);
  border-bottom: 1px solid var(--border);
  font-size: 12px;
  color: var(--text-secondary);
  flex-shrink: 0;
}

/* 消息区域 */
.messages-area {
  flex: 1;
  overflow-y: auto;
  padding: 24px 20px;
  scroll-behavior: smooth;
}

/* 欢迎界面 */
.welcome-section {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  padding: 40px 20px;
  animation: fadeInUp 0.5s ease;
}

@keyframes fadeInUp {
  from { opacity: 0; transform: translateY(20px); }
  to { opacity: 1; transform: translateY(0); }
}

.welcome-avatar {
  font-size: 72px;
  margin-bottom: 20px;
  filter: drop-shadow(0 8px 24px rgba(255, 107, 157, 0.4));
  animation: bob 3s ease-in-out infinite;
}

@keyframes bob {
  0%, 100% { transform: translateY(0); }
  50% { transform: translateY(-8px); }
}

.welcome-title {
  font-size: 22px;
  font-weight: 700;
  color: var(--text-primary);
  margin-bottom: 12px;
}

.welcome-desc {
  font-size: 14px;
  color: var(--text-secondary);
  line-height: 1.8;
  margin-bottom: 28px;
}

.suggestion-chips {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  justify-content: center;
  max-width: 480px;
}

.chip {
  padding: 10px 18px;
  background: rgba(255, 107, 157, 0.08);
  border: 1px solid rgba(255, 107, 157, 0.25);
  border-radius: 24px;
  font-size: 13px;
  color: var(--primary-light);
  cursor: pointer;
  transition: all 0.2s;
  font-family: inherit;
}

.chip:hover {
  background: rgba(255, 107, 157, 0.18);
  border-color: var(--primary);
  transform: translateY(-1px);
}

/* 消息列表 */
.messages-list {
  display: flex;
  flex-direction: column;
  gap: 20px;
}

.message-row {
  display: flex;
  align-items: flex-end;
  gap: 10px;
  animation: fadeInUp 0.3s ease;
}

.user-row {
  flex-direction: row-reverse;
}

.ai-row {
  flex-direction: row;
}

.msg-avatar {
  font-size: 28px;
  flex-shrink: 0;
  line-height: 1;
  margin-bottom: 4px;
}

.bubble-wrapper {
  display: flex;
  flex-direction: column;
  gap: 4px;
  max-width: 70%;
}

.user-bubble-wrapper {
  align-items: flex-end;
}

.ai-bubble-wrapper {
  align-items: flex-start;
}

.bubble {
  padding: 12px 16px;
  border-radius: 18px;
  font-size: 15px;
  line-height: 1.7;
  word-break: break-word;
  position: relative;
}

.user-bubble {
  background: linear-gradient(135deg, #ff6b9d, #e0527f);
  color: #fff;
  border-bottom-right-radius: 6px;
  box-shadow: 0 4px 16px rgba(255, 107, 157, 0.3);
}

.ai-bubble {
  background: var(--bg-card);
  color: var(--text-primary);
  border: 1px solid var(--border);
  border-bottom-left-radius: 6px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
}

.ai-bubble.streaming {
  border-color: rgba(255, 107, 157, 0.4);
}

.cursor-blink {
  display: inline-block;
  color: var(--primary);
  animation: blink 0.8s step-end infinite;
  margin-left: 2px;
  font-size: 14px;
}

@keyframes blink {
  0%, 100% { opacity: 1; }
  50% { opacity: 0; }
}

.msg-time {
  font-size: 11px;
  color: var(--text-secondary);
  padding: 0 4px;
}

/* 消息动画 */
.message-enter-active {
  transition: all 0.3s ease;
}

.message-enter-from {
  opacity: 0;
  transform: translateY(10px);
}

/* 底部输入区域 */
.input-area {
  padding: 16px 20px 20px;
  background: var(--bg-card);
  border-top: 1px solid var(--border);
  flex-shrink: 0;
}

.input-wrapper {
  display: flex;
  align-items: flex-end;
  gap: 12px;
  background: var(--bg-surface);
  border: 1px solid var(--border);
  border-radius: 16px;
  padding: 8px 8px 8px 16px;
  transition: border-color 0.2s;
}

.input-wrapper:focus-within {
  border-color: rgba(255, 107, 157, 0.5);
  box-shadow: 0 0 0 3px rgba(255, 107, 157, 0.1);
}

.message-input {
  flex: 1;
  background: transparent;
  border: none;
  outline: none;
  color: var(--text-primary);
  font-size: 15px;
  font-family: inherit;
  line-height: 1.6;
  resize: none;
  min-height: 24px;
  max-height: 160px;
  padding: 4px 0;
}

.message-input::placeholder {
  color: var(--text-secondary);
}

.message-input:disabled {
  opacity: 0.6;
  cursor: not-allowed;
}

.send-btn {
  width: 40px;
  height: 40px;
  border: none;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.06);
  color: var(--text-secondary);
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.2s;
  flex-shrink: 0;
}

.send-btn.active {
  background: linear-gradient(135deg, #ff6b9d, #e0527f);
  color: #fff;
  box-shadow: 0 4px 16px rgba(255, 107, 157, 0.4);
}

.send-btn.active:hover {
  transform: scale(1.05);
  box-shadow: 0 6px 20px rgba(255, 107, 157, 0.5);
}

.send-btn:disabled {
  cursor: not-allowed;
}

/* 加载动画 */
.loading-dots {
  display: flex;
  gap: 3px;
  align-items: center;
}

.loading-dots span {
  width: 5px;
  height: 5px;
  border-radius: 50%;
  background: currentColor;
  animation: dot-bounce 1.2s ease-in-out infinite;
}

.loading-dots span:nth-child(2) { animation-delay: 0.2s; }
.loading-dots span:nth-child(3) { animation-delay: 0.4s; }

@keyframes dot-bounce {
  0%, 80%, 100% { transform: scale(0.6); opacity: 0.5; }
  40% { transform: scale(1); opacity: 1; }
}

.input-hint {
  margin-top: 8px;
  font-size: 11px;
  color: var(--text-secondary);
  text-align: center;
  opacity: 0.6;
}

/* 响应式 */
@media (max-width: 768px) {
  .bubble-wrapper {
    max-width: 80%;
  }

  .messages-area {
    padding: 16px;
  }
}
</style>
