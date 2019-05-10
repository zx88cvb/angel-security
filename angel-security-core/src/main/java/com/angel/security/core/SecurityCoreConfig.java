package com.angel.security.core;

import com.angel.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@Configuration
// SecurityProperties配置生效
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
