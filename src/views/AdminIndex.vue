<template>
    <!--  构建整个页面框架  -->
    <el-container style="border: 1px solid #eee;text-align: center" >
        <el-header class="el-header">
            <h1 class="title">体育打卡系统</h1>
            <el-button class="el-icon-s-tools" type="text" @click="exit" style="">退出登陆</el-button>
        </el-header>

        <el-container>
            <!--构建左侧菜单el-aside-->
            <el-aside  style="width: 15%; background-color: rgb(238, 241, 246)" class="el-aside">
                <!--左侧菜单内容-->
                <el-menu :default-openeds="['1']" :default-active="'1-1'">
                    <el-submenu index="1">
                        <template slot="title"><i class="el-icon-goods"></i>后台管理</template>
                        <el-menu-item index="1-1" @click="JumpAdmin"><i class="el-icon-bicycle"></i>用户管理</el-menu-item>
                        <el-menu-item index="1-2" @click="JumpComment"><i class="el-icon-basketball"></i>评论管理</el-menu-item>
                    </el-submenu>
                    <el-menu-item index="3" @click="JumpMyAccount"><i class="el-icon-setting"></i><span slot="title">我的账号</span></el-menu-item>
                </el-menu>
            </el-aside>

            <el-main >
                <body>
                <router-view></router-view>
                </body>
            </el-main>

        </el-container>
    </el-container>


</template>

<style scoped>
    .el-header {
        background-color: #B3C0D1;
        color: #333;
        line-height: 60px;
    }

    .title{
        text-align: center;
        margin-top: auto;
        margin-left: 50px;
        display:inline-block;
    }

    .el-icon-s-tools{
        display:inline-block;
        float: right;
        margin-top: 10px;
        margin-right: 10px;
    }

    /*.el-aside {*/
    /*  width: 15%;*/
    /*  */

    /*}*/

    @media screen and (max-width: 991px) {


    }


</style>

<script>
    export default {
        data() {
            const item = {
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            };
            return {
                tableData: Array(20).fill(item)
            }

        },
        methods:{
            exit(){
                this.$confirm('确定要退出吗？', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    this.$router.push({
                        name:'login',
                    })
                }).catch(() => {
                });
            },

            JumpAdmin(){
                this.$router.push({
                    name:'用户管理',
                })
            },
            JumpComment(){
                this.$router.push({
                    name:'评论管理',
                })
            },

            JumpMyAccount(){
                this.$router.push({
                    name:'管理员账号',
                })
            },
        }
    }
</script>