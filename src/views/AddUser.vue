<template>


    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="110px" class="demo-ruleForm">
        <el-form-item label="用户名" prop="username">
            <el-input v-model="ruleForm.username"></el-input>
        </el-form-item>

        <el-form-item label="密码" prop="password">
            <el-input v-model="ruleForm.password"></el-input>
        </el-form-item>

        <el-form-item label="类型" prop="type">
            <el-input v-model="ruleForm.type"></el-input>
        </el-form-item>

<!--        <el-form-item label="价格" prop="price">-->
<!--            <el-input v-model="ruleForm.price"></el-input>-->
<!--        </el-form-item>-->

        <el-form-item>
            <el-button type="primary" @click="submitForm ('ruleForm')">立即创建</el-button>
            <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
    </el-form>

</template>


<script>
    export default {
        name: "AddUser",

        data() {
            return {
                ruleForm: {
                    username: '',
                    password: '',
                    type: '',
                    // price: '',
                },
                rules: {
                    username: [
                        { required: true, message: '请输入用户名', trigger: 'change' },
                        { min: 1, max: 10, message: '长度在 1 到 10 个字符', trigger: 'change' }
                    ],
                    password: [
                        { required: true, message: '请输入密码', trigger: 'change' }
                    ],
                    type: [
                        { required: true, message: '请输入用户类型', trigger: 'change' }
                    ],
                    // price: [
                    //     { required: true, message: '请输入训练计划价格', trigger: 'change' }
                    // ],
                }
            };
        },
        methods: {
            submitForm(formName) {
                const _this = this
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        // console.log(_this.ruleForm);
                        // alert("添加成功！");
                        axios.post('http://localhost:8888/user/AddUser',this.ruleForm).then(function (resp){
                            // console.log(resp)
                            if(resp.data == 'success'){
                                _this.$alert('添加用户成功！','OK',{
                                    confirmButtonText:'确定',
                                    callback: action =>{
                                        type: 'info',
                                            _this.$router.push('/user');
                                    }
                                })
                            }else {
                                _this.$message.error('添加用户失败，请重新输入！');
                            }
                        })
                    } else {
                        _this.$message.error('添加用户失败，请重新输入！');
                        return false;
                    }
                });
            },

            resetForm(formName) {
                this.$refs[formName].resetFields();
            },


        }
    }
</script>