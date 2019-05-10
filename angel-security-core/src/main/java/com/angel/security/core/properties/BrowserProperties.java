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
}
