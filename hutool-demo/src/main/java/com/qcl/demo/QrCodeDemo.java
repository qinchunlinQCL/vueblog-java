package com.qcl.demo;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.json.JSONUtil;
import com.qcl.entity.UserEntity;

import java.io.*;

/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName QrCodeDemo
 * @Description
 * @createTime 2021年03月02日 11:01:00
 */
public class QrCodeDemo {
    public static void main(String[] args) throws Exception {
        UserEntity userEntity=new UserEntity();
        userEntity.setPassWord("123");
        userEntity.setUserName("aa");
        //利用hutool的json工具类转换成json
        String userJson = JSONUtil.toJsonStr(userEntity);
        // 生成指定url对应的二维码到文件，宽和高都是300像素
        File generate = QrCodeUtil.generate(userJson, 300, 300, FileUtil.file("d:/qrcode.jpg"));
        //转换成输入流
        FileInputStream fis=new FileInputStream(generate);
        //转换成输出流
        FileOutputStream ous=new FileOutputStream(generate);
        //转换成byte[]数组
        byte[] byArray = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1)
        {
            bos.write(b, 0, n);
        }
        fis.close();
        bos.close();
        byArray = bos.toByteArray();
    }
}
