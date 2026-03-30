import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '@/views/HomePage.vue'
import EmotionFixChat from '@/views/EmotionFixChat.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/emotion-fix',
    name: 'EmotionFix',
    component: EmotionFixChat
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
