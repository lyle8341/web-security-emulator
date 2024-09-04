package com.lyle.wse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lyle.wse.mapper")
@SpringBootApplication
public class WebSecurityEmulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSecurityEmulatorApplication.class, args);
    }

}
