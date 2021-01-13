package com.guigu.web;

import com.guigu.bean.User;
import com.guigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        try {
            userService.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }

        return ;
    }
}
