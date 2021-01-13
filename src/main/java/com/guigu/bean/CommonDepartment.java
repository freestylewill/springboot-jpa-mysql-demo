package com.guigu.bean;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName CommonDepartment
 * @Description TODO
 * @Author HDD
 * @Date 2019/9/6 14:13
 * @Version 1.0
 **/
@Entity
@Table(appliesTo = "common_department")
public class CommonDepartment {
    //自增ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer department_id;
    private String department_name;
    private String department_des;

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_des() {
        return department_des;
    }

    public void setDepartment_des(String department_des) {
        this.department_des = department_des;
    }

    @Override
    public String toString() {
        return "CommonDepartment{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", department_des='" + department_des + '\'' +
                '}';
    }
}
