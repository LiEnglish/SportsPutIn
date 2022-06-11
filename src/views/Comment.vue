<template>
    <div>

        <el-container>

            <el-table id="table"
                      :data="Comment"
                      border>
                <el-table-column
                        prop="comid"
                        label="编号"
                        width="50px">
                </el-table-column>
                <el-table-column
                        prop="username"
                        label="用户名"
                        width="150px">
                </el-table-column>
                <el-table-column
                        prop="comclass"
                        label="课程"
                        width="120px">
                </el-table-column>
                <el-table-column
                        prop="comcoach"
                        label="教练"
                        width="90px">
                </el-table-column>
                <el-table-column
                        prop="comments"
                        label="评论"
                        width="120px">
                </el-table-column>

                <el-table-column
                        prop="score"
                        label="得分"
                        width="160px">
                    <div class="block">
                        <el-rate v-model="value1" disabled="true"></el-rate>
                    </div>
                </el-table-column>

                <el-table-column
                        label="操作" style="width: 100px;">
                    <template slot-scope="scope" >
                        <div class="el-row--flex">

                            <el-popover
                                    placement="top"
                                    width="160"
                                    v-model="visible">
                                <p>确认删除？</p>
                                <div style="text-align: right">
                                    <el-button size="mini" type="text" @click="visible = false">取消</el-button>
                                    <el-button type="primary" size="mini" @click="visible = false, deleteComment(scope.row)">确定</el-button>
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
    </div>
</template>

<script >
    export default {
        name: "Comment",

        methods: {

            deleteComment(row) {
                const _this = this
                axios.delete('http://localhost:8888/comment/deleteComment/' + row.comid).then(function () {
                    _this.$alert('删除评论成功！', '消息', {
                        confirmButtonText: '确定',
                        callback: action => {
                            type: 'info',
                                window.location.reload()
                        }
                    })
                })
            },

            //     // 跳转到传递参数页
            //     JumpPunchIn(){
            //         this.$router.push({
            //             path:'/PunchIn'
            //         })
            //     }
            // },

            data() {
                return {
                    comment: [
                        {
                            comid: '1',
                            username: 'zhangsan',
                            comclass: '李教练',
                            comcoach: '跑步',
                            comments: '这个课程不错。',
                        },
                    ],
                }
            },

            created() {
                const _this = this
                axios.get('http://localhost:8888/comment/findmyAllcomment').then(function (resp) {
                    _this.comment = resp.data
                })
            },

        }
    }

</script>



<style scoped>


</style>