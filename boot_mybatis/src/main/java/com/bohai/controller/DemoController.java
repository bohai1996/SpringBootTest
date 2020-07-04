package com.bohai.controller;

import com.bohai.domain.User;
import com.bohai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/q")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();

        return userList;
    }
}
