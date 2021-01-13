package com.guigu.bean;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName CommonEquipment
 * @Description TODO
 * @Author HDD
 * @Date 2019/9/11 10:32
 * @Version 1.0
 **/
@Entity
@Table(appliesTo = "common_equipment")
public class CommonEquipment {

    //自增ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer equipment_id;
    private Integer add_time;
    private String machine_id;
    private Integer site_id;
    private Integer equipment_class_id;
    private Integer equipment_model_id;
    private String equipment_name;
    private String description;
    private Integer equip_count;
    private String is_normal;
    private Integer status;

    public CommonEquipment() {
    }

    public CommonEquipment(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public CommonEquipment(Integer equipment_id, Integer site_id) {
        this.equipment_id = equipment_id;
        this.site_id = site_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Integer getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    public String getMachine_id() {
        return machine_id;
    }

    public void setMachine_id(String machine_id) {
        this.machine_id = machine_id;
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Integer getEquipment_class_id() {
        return equipment_class_id;
    }

    public void setEquipment_class_id(Integer equipment_class_id) {
        this.equipment_class_id = equipment_class_id;
    }

    public Integer getEquipment_model_id() {
        return equipment_model_id;
    }

    public void setEquipment_model_id(Integer equipment_model_id) {
        this.equipment_model_id = equipment_model_id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEquip_count() {
        return equip_count;
    }

    public void setEquip_count(Integer equip_count) {
        this.equip_count = equip_count;
    }

    public String getIs_normal() {
        return is_normal;
    }

    public void setIs_normal(String is_normal) {
        this.is_normal = is_normal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
