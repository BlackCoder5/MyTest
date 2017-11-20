package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by gz on 2017/11/7
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
