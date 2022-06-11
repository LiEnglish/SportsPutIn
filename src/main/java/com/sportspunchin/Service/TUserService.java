package com.sportspunchin.Service;


import com.sportspunchin.pojo.TUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TUserService {
    List<TUser> findAlluser();
}
