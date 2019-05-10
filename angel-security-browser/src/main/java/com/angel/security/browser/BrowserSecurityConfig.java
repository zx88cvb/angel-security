package com.angel.security.browser;

import com.angel.security.browser.authentication.AngelAuthenctiationFailureHandler;
import com.angel.security.browser.authentication.AngelAuthenticationSuccessHandler;
import com.angel.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.annotation.Resource;

/**
 * @author JingXiang Bi
 * @date 2019/5/8
 */
@Configuration
@EnableWebSecurity
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private AngelAuthenticationSuccessHandler angelAuthenticationSuccessHandler;

    @Autowired
    private AngelAuthenctiationFailureHandler angelAuthenctiationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/authentication/require")
                // 登录接口url
                .loginProcessingUrl("/authentication/form")
                .successHandler(angelAuthenticationSuccessHandler)
                .failureHandler(angelAuthenctiationFailureHandler)
                .and()
                .authorizeRequests()
                // 匹配到 不进行身份认证
                .antMatchers("/authentication/require",
                        securityProperties.getBrowser().getLoginPage()).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
