package com.misaka.Servvicer;

import com.misaka.Domain.User;

public interface UserService {
    User SelectById(int id);
//    登录
    Boolean Login(String username,String password);
}
