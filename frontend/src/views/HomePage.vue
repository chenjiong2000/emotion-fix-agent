<template>
  <div class="home">
    <!-- 顶部标题栏 -->
    <header class="home-header">
      <div class="header-content">
        <div class="logo">
          <span class="logo-icon">✨</span>
          <span class="logo-text">AI 心桥</span>
        </div>
        <p class="header-subtitle">懂你心事，陪你前行</p>
      </div>
      <div class="header-decoration">
        <div class="floating-heart heart-1">💕</div>
        <div class="floating-heart heart-2">💖</div>
        <div class="floating-heart heart-3">💗</div>
      </div>
    </header>

    <!-- 应用卡片网格 -->
    <main class="apps-grid">
      <h2 class="section-title">选择应用</h2>
      <div class="cards-container">
        <div
          v-for="app in apps"
          :key="app.id"
          class="app-card"
          @click="navigateTo(app.route)"
        >
          <div class="card-glow" :style="{ background: app.glowColor }"></div>
          <div class="card-inner">
            <div class="card-icon">{{ app.icon }}</div>
            <div class="card-content">
              <h3 class="card-title">{{ app.title }}</h3>
              <p class="card-desc">{{ app.description }}</p>
            </div>
            <div class="card-tags">
              <span v-for="tag in app.tags" :key="tag" class="tag">{{ tag }}</span>
            </div>
            <div class="card-arrow">
              <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
                <path d="M7 10h6M10 7l3 3-3 3" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
              </svg>
            </div>
          </div>
        </div>
      </div>
    </main>

    <!-- 底部装饰 -->
    <footer class="home-footer">
      <p>由 AI 驱动，让每段关系都更有温度 🌉</p>
    </footer>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'

const router = useRouter()

const apps = [
  {
    id: 1,
    icon: '🌉',
    title: 'AI 心桥',
    description: '懂你心事，陪你前行。解析人际关系困境，帮你修复情感连结，让每一段关系都更有温度。',
    tags: ['人际关系', '情感疏导', '沟通建议', 'AI 陪伴'],
    route: '/emotion-fix',
    glowColor: 'radial-gradient(circle at 30% 30%, rgba(255, 107, 157, 0.3), transparent 70%)'
  }
]

function navigateTo(route) {
  router.push(route)
}
</script>

<style scoped>
.home {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  background: var(--bg);
  position: relative;
  overflow: hidden;
}

.home::before {
  content: '';
  position: fixed;
  top: -50%;
  left: -50%;
  width: 200%;
  height: 200%;
  background: radial-gradient(ellipse at 20% 20%, rgba(255, 107, 157, 0.08) 0%, transparent 50%),
              radial-gradient(ellipse at 80% 80%, rgba(196, 77, 255, 0.06) 0%, transparent 50%);
  pointer-events: none;
  z-index: 0;
}

/* 顶部标题栏 */
.home-header {
  position: relative;
  padding: 60px 48px 48px;
  overflow: hidden;
  z-index: 1;
}

.header-content {
  position: relative;
  z-index: 2;
}

.logo {
  display: flex;
  align-items: center;
  gap: 12px;
  margin-bottom: 12px;
}

.logo-icon {
  font-size: 36px;
  animation: sparkle 2s ease-in-out infinite;
}

@keyframes sparkle {
  0%, 100% { transform: scale(1) rotate(0deg); }
  50% { transform: scale(1.1) rotate(10deg); }
}

.logo-text {
  font-size: 32px;
  font-weight: 700;
  background: linear-gradient(135deg, #ff6b9d, #c44dff);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

.header-subtitle {
  font-size: 16px;
  color: var(--text-secondary);
  letter-spacing: 0.5px;
}

.header-decoration {
  position: absolute;
  top: 0;
  right: 0;
  width: 300px;
  height: 200px;
  pointer-events: none;
}

.floating-heart {
  position: absolute;
  font-size: 24px;
  animation: float 4s ease-in-out infinite;
  opacity: 0.6;
}

.heart-1 { top: 20px; right: 80px; animation-delay: 0s; font-size: 28px; }
.heart-2 { top: 60px; right: 40px; animation-delay: 1s; font-size: 20px; }
.heart-3 { top: 100px; right: 120px; animation-delay: 2s; font-size: 24px; }

@keyframes float {
  0%, 100% { transform: translateY(0px) rotate(-5deg); }
  50% { transform: translateY(-12px) rotate(5deg); }
}

/* 应用网格 */
.apps-grid {
  flex: 1;
  padding: 0 48px 48px;
  position: relative;
  z-index: 1;
}

.section-title {
  font-size: 18px;
  font-weight: 600;
  color: var(--text-secondary);
  margin-bottom: 24px;
  letter-spacing: 0.5px;
}

.cards-container {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(320px, 1fr));
  gap: 24px;
}

/* 应用卡片 */
.app-card {
  position: relative;
  border-radius: 20px;
  background: var(--bg-card);
  border: 1px solid var(--border);
  cursor: pointer;
  overflow: hidden;
  transition: transform 0.3s ease, box-shadow 0.3s ease, border-color 0.3s ease;
}

.app-card:hover {
  transform: translateY(-4px);
  box-shadow: 0 20px 60px rgba(255, 107, 157, 0.2);
  border-color: rgba(255, 107, 157, 0.5);
}

.app-card:hover .card-glow {
  opacity: 1;
}

.card-glow {
  position: absolute;
  inset: 0;
  opacity: 0;
  transition: opacity 0.3s ease;
  pointer-events: none;
}

.card-inner {
  position: relative;
  padding: 28px;
  z-index: 1;
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.card-icon {
  font-size: 48px;
  line-height: 1;
  filter: drop-shadow(0 4px 8px rgba(255, 107, 157, 0.3));
}

.card-content {
  flex: 1;
}

.card-title {
  font-size: 22px;
  font-weight: 700;
  color: var(--text-primary);
  margin-bottom: 8px;
}

.card-desc {
  font-size: 14px;
  color: var(--text-secondary);
  line-height: 1.7;
}

.card-tags {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.tag {
  padding: 4px 12px;
  background: rgba(255, 107, 157, 0.12);
  border: 1px solid rgba(255, 107, 157, 0.25);
  border-radius: 20px;
  font-size: 12px;
  color: var(--primary-light);
  font-weight: 500;
}

.card-arrow {
  display: flex;
  justify-content: flex-end;
  color: var(--primary);
  opacity: 0;
  transition: opacity 0.3s ease, transform 0.3s ease;
  transform: translateX(-8px);
}

.app-card:hover .card-arrow {
  opacity: 1;
  transform: translateX(0);
}

/* 底部 */
.home-footer {
  padding: 24px 48px;
  text-align: center;
  color: var(--text-secondary);
  font-size: 13px;
  border-top: 1px solid var(--border);
  position: relative;
  z-index: 1;
}

/* 响应式 */
@media (max-width: 768px) {
  .home-header {
    padding: 40px 24px 32px;
  }

  .apps-grid {
    padding: 0 24px 32px;
  }

  .logo-text {
    font-size: 24px;
  }

  .cards-container {
    grid-template-columns: 1fr;
  }

  .header-decoration {
    display: none;
  }
}
</style>
