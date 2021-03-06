package com.qcl.demo;


import cn.hutool.core.bean.BeanUtil;
import com.qcl.entity.UserEntity;
import com.qcl.entity.UserEntity2;


/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName BeanUtilsDemo
 * @Description
 * @createTime 2021年03月05日 13:59:00
 */
public class BeanUtilsDemo {
    public static void main(String[] args) {
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("22");
        userEntity.setEmail("223");
        userEntity.setId(1);
        UserEntity2 userEntity2=new UserEntity2();
        userEntity2.setAge(1);
        userEntity2.setId(2);
        userEntity2.setPassWord("2432");
        BeanUtil.copyProperties(userEntity,userEntity2,"passWord","userName");
        System.out.println(userEntity2);
    }
}
