package com.angel.security.core.properties;

import lombok.Data;

/**
 * 图形验证码配置
 * @author JingXiang Bi
 * @date 2019/5/10
 */
@Data
public class ImageCodeProperties {
    /**
     * 宽
     */
    private int width = 67;
    /**
     * 高
     */
    private int height = 23;
    /**
     * 长度
     */
    private int length = 4;
    /**
     * 过期时间
     */
    private int expireIn = 60;

    /**
     * 路径
     */
    private String url;

}
