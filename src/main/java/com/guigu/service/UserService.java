package com.guigu.service;

import com.guigu.bean.User;

import java.util.List;
/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
public interface UserService {
    List<User> findAll();

    void  deleteById(Long id);
}
