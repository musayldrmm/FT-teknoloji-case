package com.FtTeknoloji.FtTeknoloji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)


public class FtTeknolojiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtTeknolojiApplication.class, args);
    }

}
