package com.angel.security.core.validate;

import com.angel.security.core.properties.SecurityProperties;
import com.angel.security.core.validate.image.ImageCodeGenerator;
import com.angel.security.core.validate.sms.DefaultSmsCodeSender;
import com.angel.security.core.validate.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author JingXiang Bi
 * @date 2019/5/13
 */
@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    // 当不存在imageCodeGenerator 会走下面配置
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator () {
        ImageCodeGenerator imageCodeGenerator = new ImageCodeGenerator();
        imageCodeGenerator.setSecurityProperties(securityProperties);
        return imageCodeGenerator;
    }

    /**
     * 短信验证码
     * @return SmsCodeSender
     */
    @Bean
    // 当不存在imageCodeGenerator 会走下面配置
    @ConditionalOnMissingBean(SmsCodeSender.class)
    public SmsCodeSender smsCodeSender () {
        return new DefaultSmsCodeSender();
    }
}
