package com.angel.security.core.validate.image;

import com.angel.security.core.validate.ValidateCode;
import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * 图形验证码
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@Data
public class ImageCode extends ValidateCode {

    /**
     * 图片
     */
    private BufferedImage image;

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        super(code, expireTime);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, int expireIn) {
        super(code, expireIn);
        this.image = image;
    }
}
