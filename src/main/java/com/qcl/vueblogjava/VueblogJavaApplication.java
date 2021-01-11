package com.qcl.vueblogjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qcl")
public class VueblogJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueblogJavaApplication.class, args);
    }

}
