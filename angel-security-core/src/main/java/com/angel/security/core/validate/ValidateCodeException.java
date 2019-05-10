package com.angel.security.core.validate;

import org.springframework.security.core.AuthenticationException;

/**
 * @author JingXiang Bi
 * @date 2019/5/10
 */
public class ValidateCodeException extends AuthenticationException {
    public ValidateCodeException(String msg) {
        super(msg);
    }
}
