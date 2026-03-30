# AI 心桥 · 前端

> 懂你心事，陪你前行 —— 基于 Vue 3 + SSE 流式输出的 AI 人际关系助手

---

## 项目简介

**AI 心桥** 是一款 AI 驱动的人际关系助手应用，帮助用户解析家庭、职场、友情等各类人际困境，提供情感疏导与沟通建议。

前端采用 Vue 3 构建，通过 **SSE（Server-Sent Events）流式输出**实时呈现 AI 回复内容，带来接近真实对话的交互体验。

---

## 功能特性

- **主页**：应用入口卡片，支持多应用横向扩展
- **AI 心桥聊天室**
  - 聊天室风格 UI，用户消息靠右、AI 消息靠左
  - 进入页面自动生成唯一会话 ID（`chatId`），区分不同对话上下文
  - 基于 SSE 协议的流式输出，AI 回复逐字实时显示
  - 支持快捷问题引导，一键发起常见人际关系话题
  - 新建对话按钮，重置会话 ID 开启全新上下文

---

## 技术栈

| 分类 | 技术 |
|---|---|
| 框架 | Vue 3（Composition API） |
| 构建工具 | Vite 5 |
| 路由 | Vue Router 4 |
| HTTP 请求 | Axios（普通接口预留）|
| 流式通信 | Fetch API + ReadableStream（SSE POST）|
| 样式 | 原生 CSS，暗黑玫瑰风格设计系统 |

---

## 项目结构

```
emotion-fix-ai-agent-frontend/
├── index.html
├── vite.config.js          # Vite 配置（含 /api 反向代理）
├── package.json
├── public/
│   └── favicon.svg
└── src/
    ├── main.js
    ├── App.vue
    ├── assets/
    │   └── main.css        # 全局样式与 CSS 变量
    ├── router/
    │   └── index.js        # 路由配置
    ├── api/
    │   └── chatApi.js      # SSE 流式接口封装
    └── views/
        ├── HomePage.vue        # 主页
        └── EmotionFixChat.vue  # AI 心桥聊天页
```

---

## 后端接口说明

| 接口 | 方法 | 路径 | 说明 |
|---|---|---|---|
| 普通对话 | POST | `/api/ai/chat/emotion-fix-agent/` | 返回完整字符串 |
| SSE 流式对话 | POST | `/api/ai/chat/emotion-fix-agent/sse` | 返回 `text/event-stream` |

**请求参数（form 表单格式）：**

| 参数 | 类型 | 说明 |
|---|---|---|
| `userInput` | string | 用户输入内容 |
| `chatId` | string | 会话 ID，用于区分不同对话上下文 |

> 后端基于 Spring Boot + Spring AI，SSE 接口通过 `Flux<String>` 返回流式内容。

---

## 快速启动

### 环境要求

- Node.js >= 18
- 后端服务运行在 `http://localhost:8080`

### 安装依赖

```bash
npm install
```

### 启动开发服务器

```bash
npm run dev
```

启动后访问：[http://localhost:3000](http://localhost:3000)

> Vite 已配置 `/api` 代理，所有请求自动转发至 `http://localhost:8080`，无需额外处理跨域。

### 构建生产包

```bash
npm run build
```

产物输出至 `dist/` 目录，可直接部署至任意静态服务器（Nginx、Caddy 等）。

### 预览生产包

```bash
npm run preview
```

---

## 页面路由

| 路径 | 页面 | 说明 |
|---|---|---|
| `/` | 主页 | 应用选择入口 |
| `/emotion-fix` | AI 心桥 | SSE 流式聊天室 |
