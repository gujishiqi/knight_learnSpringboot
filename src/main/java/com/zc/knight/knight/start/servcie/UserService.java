package com.zc.knight.knight.start.servcie;

import com.zc.knight.knight.start.entity.UserEntity;
import com.zc.knight.knight.start.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserJpa userJpa;

    public List<UserEntity> getAllUser() {
        return userJpa.findAll();
    }

    public void saveUser(UserEntity user) {
        userJpa.save(user);
    }

    public void delateUser(UserEntity user) {
        userJpa.delete(user);
    }
}
