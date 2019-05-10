package com.angel.security.browser.support;

import lombok.Data;

/**
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@Data
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
