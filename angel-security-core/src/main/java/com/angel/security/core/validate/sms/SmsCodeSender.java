package com.angel.security.core.validate.sms;

/**
 * 短信验证码发送接口
 * @author JingXiang Bi
 * @date 2019/5/13
 */
public interface SmsCodeSender {
    /**
     * 发送验证码
     * @param mobile 手机号
     * @param code 验证码
     */
    void send(String mobile, String code);
}
