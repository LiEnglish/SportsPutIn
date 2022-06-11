package com.sportspunchin.Service;


import com.sportspunchin.mapper.TUserMapper;
import com.sportspunchin.pojo.TUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TUserServiceImpl implements TUserService{
    private TUserMapper tUserMapper;

    @Override
    public List<TUser> findAlluser() {
        return tUserMapper.selectList(null);
    }

    public boolean deleteuser(Integer id){
        int i = tUserMapper.deleteById(id);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean AddUser(TUser tUser){
        int i = tUserMapper.insert(tUser);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
