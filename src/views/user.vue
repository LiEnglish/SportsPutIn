<template>
    <div>

        <el-container>

            <el-table id="table"
                      :data="user"
                      border>
                <el-table-column
                        prop="id"
                        label="编号"
                        width="50px">
                </el-table-column>
                <el-table-column
                        prop="username"
                        label="用户名"
                        width="150px">
                </el-table-column>
                <el-table-column
                        prop="password"
                        label="密码"
                        width="120px">
                </el-table-column>
                <el-table-column
                        prop="type"
                        label="类型"
                        width="120px">
                </el-table-column>
<!--                <el-table-column-->
<!--                        prop="price"-->
<!--                        label="价格"-->
<!--                        width="90px">-->
<!--                </el-table-column>-->
<!--                <el-table-column-->
<!--                        prop="score"-->
<!--                        label="得分"-->
<!--                        width="160px">-->
<!--                    <div class="block">-->
<!--                        <el-rate v-model="value1" disabled="true"></el-rate>-->
<!--                    </div>-->
<!--                </el-table-column>-->

                <el-table-column
                        label="操作" style="width: 100px;">
                    <template slot-scope="scope" >
                        <div class="el-row--flex">
                            <el-button @click="JumpPunchIn" type="primary"  size="small">修改</el-button>


                            <el-popover
                                    placement="top"
                                    width="160"
                                    v-model="visible">
                                <p>确认删除吗？</p>
                                <div style="text-align: right">
                                    <el-button size="mini" type="text" @click="visible = false">取消</el-button>
                                    <el-button type="primary" size="mini" @click="visible = false , deleteuser(scope.row)">确定</el-button>
                                </div>
                                <el-button slot="reference" type="danger" plain size="small" style="margin-left: 15px">删除</el-button>
                            </el-popover>
                        </div>


                    </template>
                </el-table-column>
            </el-table>

        </el-container>
        <!--  分页  -->
        <el-pagination
                background
                layout="prev, pager, next"
                :page-size="4"
                :total="10"
                style="margin-top: 10px;"
                @current-chang="page">
        </el-pagination>

        <el-button @click="JumpAddUser" type="primary" plain class="Addbtn">增加用户</el-button>
    </div>
</template>

<script >
    export default {
        name: "user",

        methods: {

            deleteuser(row) {
                const _this = this
                axios.delete('http://localhost:8888/tuser/deleteuser/' + row.id).then(function () {
                    _this.$alert('删除用户成功！', '消息', {
                        confirmButtonText: '确定',
                        callback: action => {
                            type: 'info',
                                window.location.reload()
                        }
                    })
                })
            },

            // 跳转到传递参数页
            //     JumpPunchIn(){
            //         this.$router.push({
            //             path:'/PunchIn'
            //         })
            //     }
            // },

            JumpAddUser() {
                this.$router.push({
                    path: '/AddUser'
                })
            },

            data() {
                return {
                    user: [
                        {
                            id: '1',
                            name: 'lisi',
                            password: '0002',
                            type: 'coach',
                            // price:'20',
                            // comment:''
                        },
                    ],
                }
            },

            created() {
                const _this = this
                axios.get('http://localhost:8888/tuser/findAlluser').then(function (resp) {
                    _this.user = resp.data
                })
            },

        }
    }

</script>



<style scoped>


</style>