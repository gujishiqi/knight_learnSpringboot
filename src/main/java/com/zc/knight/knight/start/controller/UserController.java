package com.zc.knight.knight.start.controller;

import com.zc.knight.knight.restful.ResponseBean;
import com.zc.knight.knight.start.entity.UserEntity;
import com.zc.knight.knight.start.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userServcie;

    @GetMapping(value = "list")
    public Object getUser() {
        List<UserEntity> allUser = userServcie.getAllUser();
        if(allUser.size()<1){
            return new ResponseBean(100, "获取用户列表成功",null);
        }else{
            return new ResponseBean(100, "获取用户列表成功", allUser);
        }

    }

    @PostMapping(value = "")
    public Object saveUser(UserEntity user) {
        userServcie.saveUser(user);
        return new ResponseBean(100, "添加用户"+user.getName()+"成功", userServcie.getAllUser());
    }

    @PutMapping(value="")
    public Object updateUser(UserEntity user){
        userServcie.saveUser(user);
        return new ResponseBean(100, "更新用户"+user.getName()+"成功", userServcie.getAllUser());
    }

    @DeleteMapping(value="")
    public Object deleteUser(UserEntity user){
        userServcie.delateUser(user);
        return new ResponseBean(100, "删除用户"+user.getName()+"成功", userServcie.getAllUser());
    }




}
