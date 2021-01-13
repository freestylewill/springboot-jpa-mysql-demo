package com.guigu.web;

import com.guigu.bean.Student;
import com.guigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    int cnt = 0;

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        try {
            studentService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return;
    }

    @RequestMapping("add")
    @ResponseBody
    public void add() {
        Student student = new Student();
        student.setName("junjun" + (cnt++));
        student.setAge(6);
        studentService.save(student);
    }

    @RequestMapping("update")
    @ResponseBody
    public void update() {
        Student user = studentService.findById(1L);
        user.setName("duoduo");
        studentService.save(user);
    }
}
