import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yishikaiyao from '@/views/modules/yishikaiyao/list'
    import yaokuxinxi from '@/views/modules/yaokuxinxi/list'
    import yonghuquyao from '@/views/modules/yonghuquyao/list'
    import tijianbaogao from '@/views/modules/tijianbaogao/list'
    import yuyueguahao from '@/views/modules/yuyueguahao/list'
    import jiaofeiqingdan from '@/views/modules/jiaofeiqingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import guanyuwomen from '@/views/modules/guanyuwomen/list'
    import yaopinleixing from '@/views/modules/yaopinleixing/list'
    import keshileixing from '@/views/modules/keshileixing/list'
    import menzhenxinxi from '@/views/modules/menzhenxinxi/list'
    import config from '@/views/modules/config/list'
    import yishi from '@/views/modules/yishi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/yishikaiyao',
        name: '医师开药',
        component: yishikaiyao
      }
      ,{
	path: '/yaokuxinxi',
        name: '药库信息',
        component: yaokuxinxi
      }
      ,{
	path: '/yonghuquyao',
        name: '用户取药',
        component: yonghuquyao
      }
      ,{
	path: '/tijianbaogao',
        name: '体检报告',
        component: tijianbaogao
      }
      ,{
	path: '/yuyueguahao',
        name: '预约挂号',
        component: yuyueguahao
      }
      ,{
	path: '/jiaofeiqingdan',
        name: '缴费清单',
        component: jiaofeiqingdan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/guanyuwomen',
        name: '关于我们',
        component: guanyuwomen
      }
      ,{
	path: '/yaopinleixing',
        name: '药品类型',
        component: yaopinleixing
      }
      ,{
	path: '/keshileixing',
        name: '科室类型',
        component: keshileixing
      }
      ,{
	path: '/menzhenxinxi',
        name: '门诊信息',
        component: menzhenxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yishi',
        name: '医师',
        component: yishi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
