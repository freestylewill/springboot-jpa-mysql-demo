package com.guigu.service.impl;

import com.guigu.bean.Student;
import com.guigu.dao.StudentRepository;
import com.guigu.service.StudentService;
import com.guigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
//        int i = 1/0;
    }

    @Override
    public void save(Student student) {

        studentRepository.save(student);

    }

    @Override
    public Student findById(Long i) {
        Student student = studentRepository.findById(1L).get();
        return student;
    }
}
