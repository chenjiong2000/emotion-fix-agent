const BASE_URL = '/api'

/**
 * SSE 流式调用 AI 恋爱大师接口
 *
 * 由于浏览器原生 EventSource 仅支持 GET 请求，
 * 这里使用 Fetch API + ReadableStream 来处理 POST SSE 响应。
 *
 * @param {string} userInput - 用户输入
 * @param {string} chatId - 会话 ID
 * @param {function} onChunk - 每收到一段内容时的回调，参数为文本片段
 * @returns {Promise<void>}
 */
export async function doChatWithEmotionFixAgentSSE(userInput, chatId, onChunk) {
  const url = `${BASE_URL}/ai/chat/emotion-fix-agent/sse`

  const body = new URLSearchParams({ userInput, chatId })

  const response = await fetch(url, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded',
      'Accept': 'text/event-stream'
    },
    body: body.toString()
  })

  if (!response.ok) {
    throw new Error(`HTTP 错误：${response.status} ${response.statusText}`)
  }

  const reader = response.body.getReader()
  const decoder = new TextDecoder('utf-8')
  let buffer = ''

  while (true) {
    const { done, value } = await reader.read()
    if (done) break

    buffer += decoder.decode(value, { stream: true })

    // 按 SSE 协议解析，每条事件以 \n\n 结尾
    const lines = buffer.split('\n')
    buffer = lines.pop() ?? ''

    for (const line of lines) {
      const trimmed = line.trim()
      if (!trimmed) continue

      if (trimmed.startsWith('data:')) {
        const data = trimmed.slice(5).trim()
        // 忽略心跳或结束标记
        if (data === '[DONE]' || data === '') continue
        onChunk(data)
      }
    }
  }

  // 处理缓冲区中剩余内容
  if (buffer.trim()) {
    const trimmed = buffer.trim()
    if (trimmed.startsWith('data:')) {
      const data = trimmed.slice(5).trim()
      if (data && data !== '[DONE]') {
        onChunk(data)
      }
    }
  }
}
