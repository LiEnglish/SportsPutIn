<template>
    <!-- 后台的框架 -->
    <div>
        <!-- 头部栏 -->
        <Header :admin="admin" />
        <!-- 主体 -->
        <div style="display: flex">
            <!-- 侧边栏 -->
            <Aside />
            <!-- 内容区域 -->
            <router-view style="flex: 1" />
        </div>
    </div>
</template>

// 这个为后台的框架模板,头部导航栏,侧边栏,以及中心展示区<router-view/>

<script>
    //导入components下的admin下的组件
    import Header from "@/layout/Header.vue";
    import Aside from "@/layout/Aside.vue";
    import request from "@/utils/request";

    export default {
        name: "Layout",
        components: {
            Header,
            Aside,
        },
        data(){
            return{
                admin:{username:'后台管理'}
            }
        },

        created() {
            this.refreshAdmin();
        },
        methods:{
            refreshAdmin(){
                let adminJson = sessionStorage.getItem("admin");
                if (!adminJson){
                    return this.$router.push("/");
                }
                console.log("输出的admin："+ adminJson);
                this.admin = JSON.parse(adminJson);
            }

        }
    };
</script>

<style>
</style>