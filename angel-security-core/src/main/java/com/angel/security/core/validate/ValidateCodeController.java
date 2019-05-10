package com.angel.security.core.validate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证码
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@RestController
public class ValidateCodeController {

    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) {

    }
}
