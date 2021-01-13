package com.guigu.dao;
 
import com.guigu.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface StudentRepository extends JpaRepository<Student,Long> {
}