package com.angel.security.core.properties;

import lombok.Data;

/**
 * 验证配置
 * @author JingXiang Bi
 * @date 2019/5/10
 */
@Data
public class ValidateCodeProperties {
    /**
     * 图形验证码
     */
    ImageCodeProperties image = new ImageCodeProperties();

    /**
     * 短信验证码
     */
    SmsCodeProperties sms = new SmsCodeProperties();
}
