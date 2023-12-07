package org.example.config;

import org.example.model.User;
import org.example.util.EncryptionUtil;
import org.springframework.beans.BeansException;
        import org.springframework.beans.factory.config.BeanPostProcessor;
        import org.springframework.stereotype.Component;

@Component
public class UserBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            User user = (User) bean;
            String encryptedPhoneNumber = EncryptionUtil.encrypt(user.getPhoneNumber());
            user.setPhoneNumber(encryptedPhoneNumber);
        }
        return bean;
    }
}