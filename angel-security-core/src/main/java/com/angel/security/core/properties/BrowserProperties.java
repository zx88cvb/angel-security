package com.angel.security.core.properties;

import lombok.Data;

/**
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@Data
public class BrowserProperties {

    /**
     * 登录页面
     */
    private String loginPage = "angel-sign.html";

    /**
     * 登录类型
     */
    private LoginType loginType = LoginType.JSON;

    /**
     * 记住我秒数时长
     */
    private int rememberMeSeconds = 3600;
}
