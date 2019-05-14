package com.angel.security.core.validate;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 验证码
 * @author JingXiang Bi
 * @date 2019/5/13
 */
@Data
public class ValidateCode {
    /**
     * 验证码
     */
    private String code;

    /**
     * 过期时间
     */
    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireIn){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCode(String code, LocalDateTime expireTime){
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
