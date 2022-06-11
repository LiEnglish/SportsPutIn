import Vue from 'vue'
import VueRouter from 'vue-router'
import Sport from "../views/Sport";
import BallSport from "../views/BallSport";
import MyPEPlan from "@/views/MyPEPlan";
import MyAccount from "@/views/MyAccount";
import Index from  "@/views/Index";
import AddPEPlan from "@/views/AddPEPlan";
import PunchIn from "@/views/PunchIn";
import Market from "@/views/Market";
import CoachPEPlan from "@/views/CoachPEPlan";
import UpdatePEPlan from "@/views/UpdatePEPlan";
import CoachAccount from "@/views/CoachAccount";
import AddUser from "@/views/AddUser";
import user from "@/views/user";
import Comment from "@/views/Comment";
import AdminAccount from "@/views/AdminAccount";
// import layout from "@/layout/Layout"



Vue.use(VueRouter)

const routes = [
  {
    path: '/login',
    name: 'login',
    component:() => import('../views/login.vue')
  },

  {
    path: "/",
    name: "主界面",
    component: Index,
    redirect: "/Market",
    children:[
      {
        path: "/Sport",
        name: "运动",
        component: Sport
      },
      {
        path: "/BallSport",
        name: "球类运动",
        component: BallSport
      },
      {
        path: "/MyPEPlan",
        name: "我的锻炼计划",
        component: MyPEPlan,
      },
      {
        path: "/MyAccount",
        name: "我的账号",
        component: MyAccount,
      },
      // {
      //   path: "/AddPEPlan",
      //   name:"添加锻炼计划",
      //   component: AddPEPlan
      // },
      {
        path: "/PunchIn",
        name: "训练计划打卡",
        component: PunchIn
      },
      {
        path: "/Market",
        name: "商城",
        component: Market
      },
      {
        path: "/UpdatePEPlan",
        name: "编辑计划",
        component: UpdatePEPlan
      }
      ],
  },
  {
    path: '/CoachIndex',
    name: '教练主界面',
    component: ()=>import('../views/CoachIndex.vue'),
    children:[
      {
        path: "/AddPEPlan",
        name:"添加锻炼计划",
        component: AddPEPlan
      },
      {
        path: "/CoachPEPlan",
        name: "教练的计划",
        component: CoachPEPlan
      },
      {
        path: "/CoachAccount",
        name: "教练账号",
        component: CoachAccount,
      },

    ]
  },

  {
    path: '/AdminIndex',
    name: '管理员主页面',
    component: () => import('../views/AdminIndex'),
    // redirect: "/user",//当访问/时自动访问到home界面里面
    children: [
      //子路由,用来展示表格界面
      {
        path: "/AddUser",
        name:"添加用户",
        component: AddUser
      },
      {
        path: "/user",
        name:"用户管理",
        component: user
      },
      {
        path: "/Comment",
        name: "评论管理",
        component: Comment
      },
      {
        path: "/AdminAccount",
        name: "管理员账号",
        component: AdminAccount,
      },

    ]
  }


]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
