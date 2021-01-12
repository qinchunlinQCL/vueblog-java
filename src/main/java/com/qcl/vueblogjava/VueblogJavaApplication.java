package com.qcl.vueblogjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.qcl")
public class VueblogJavaApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VueblogJavaApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VueblogJavaApplication.class);
    }
}
