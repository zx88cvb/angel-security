package com.angel.security.core.properties;

import lombok.Data;

/**
 * 短信
 * @author JingXiang Bi
 * @date 2019/5/13
 */
@Data
public class SmsCodeProperties {
    /**
     * 长度
     */
    private int length = 6;
    /**
     * 过期时间
     */
    private int expireIn = 60;

    /**
     * 链接
     */
    private String url;
}
