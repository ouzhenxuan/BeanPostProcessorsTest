package org.example.controller;

import org.example.model.User;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final AutowireCapableBeanFactory beanFactory;

    public TestController(AutowireCapableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @PostMapping("/bean")
    public String testOzx(@RequestBody User user){

        User processedUser = (User) beanFactory.applyBeanPostProcessorsAfterInitialization(user, "userInfo");

        return processedUser.getName() +" : "+ processedUser.getPhoneNumber();
    }



}
