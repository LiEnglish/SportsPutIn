package com.sportspunchin.Controller;

import com.sportspunchin.mapper.TUserMapper;
import com.sportspunchin.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/tuser")
@RestController
public class TUserController {

    @Autowired
    private TUserMapper tUserMapper;


    @GetMapping("/findAlluser")
    public List<TUser> findAlluser(){
        return tUserMapper.selectList(null);
    }

    //根据ID查
    public void Selectbuid(@PathVariable("id") Integer id){
        TUser tUser = tUserMapper.selectById(id);
    }

    //删
    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable("id") Integer id){
        tUserMapper.deleteById(id);
    }


    //增
    @PostMapping("/AddUser")
    public String AddUser(@RequestBody TUser tUser){

        Integer result = tUserMapper.insert(tUser);
        if (result > 0){
            return "success";
        }else {
            return "error";
        }
    }
}
