package com.angel.security.core.validate.sms;

/**
 * 默认实现
 * @author JingXiang Bi
 * @date 2019/5/13
 */
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机:"+ mobile +"发送短信验证码:"+code);
    }
}
