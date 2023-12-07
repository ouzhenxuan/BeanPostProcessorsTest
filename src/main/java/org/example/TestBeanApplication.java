package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = "org.example")
@SpringBootApplication
public class TestBeanApplication {

    private static final Logger log = LoggerFactory.getLogger(TestBeanApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(TestBeanApplication.class, args);

        log.warn("服务启动");
    }

}