package com.guigu.dao;

import com.guigu.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author majun
 * @date 2020/6/3 23:43
 * @email freestylewill@163.com
 */
@Component
public interface UserRepository extends JpaRepository<User,Long> {
    /*
    * 我们在这里直接继承 JpaRepository
    * 这里面已经有很多现场的方法了
    * 这也是JPA的一大优点
    *
    * */
}
