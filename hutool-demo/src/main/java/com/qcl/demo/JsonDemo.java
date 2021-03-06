package com.qcl.demo;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.qcl.entity.UserEntity;
import net.sf.json.JSONObject;

/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName JsonDemo
 * @Description
 * @createTime 2021年03月05日 16:22:00
 */
public class JsonDemo {

    public static void main(String[] args) throws JsonProcessingException {
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("22");
        userEntity.setEmail("223");
        userEntity.setId(1);

        //gson
        Gson gson=new Gson();
        String s = gson.toJson(userEntity);
        System.out.println(s);

        //hutool
        String s1 = JSONUtil.toJsonStr(userEntity);
        System.out.println(s1);

        //fastjson
        String s2 = JSON.toJSONString(userEntity);
        System.out.println(s2);

        //jackson
        ObjectMapper mapper=new ObjectMapper();
        String s3 = mapper.writeValueAsString(userEntity);
        System.out.println(s3);

        //json-lib
        String s4 = JSONObject.fromObject(userEntity).toString();
        System.out.println(s4);
    }
}
