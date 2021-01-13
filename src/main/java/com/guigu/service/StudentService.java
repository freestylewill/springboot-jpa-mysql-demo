package com.guigu.service;

import com.guigu.bean.Student;
import com.guigu.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
public interface StudentService {
    List<Student> findAll();

    void  deleteById(Long id);

    void save(Student student);

    Student findById(Long i);
}
