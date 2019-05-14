package com.angel.security.core.validate;

import com.angel.security.core.validate.image.ImageCode;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码生成
 * @author JingXiang Bi
 * @date 2019/5/13
 */
public interface ValidateCodeGenerator {
    /**
     * 生成验证码
     * @param request request
     * @return ValidateCode
     */
    ValidateCode createImageCode(HttpServletRequest request);

}
