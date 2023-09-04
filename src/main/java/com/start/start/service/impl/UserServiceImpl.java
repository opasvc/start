package com.start.start.service.impl;

import com.start.start.mapper.UserMapper;
import com.start.start.pojo.User;
import com.start.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> userList() {
        return mapper.userList();
    }
}
