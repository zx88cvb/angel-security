package com.angel.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@ConfigurationProperties(prefix = "angel.security")
@Data
public class SecurityProperties {

    // 跳转页面browser属性
    private BrowserProperties browser = new BrowserProperties();

    /**
     * 验证
     */
    private ValidateCodeProperties code = new ValidateCodeProperties();
}
