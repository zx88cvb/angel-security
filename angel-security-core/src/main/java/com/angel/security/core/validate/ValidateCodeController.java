package com.angel.security.core.validate;

import com.angel.security.core.properties.SecurityProperties;
import com.angel.security.core.validate.image.ImageCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 验证码
 * @author JingXiang Bi
 * @date 2019/5/9
 */
@RestController
public class ValidateCodeController {

    public static final String SESSION_KEY = "SESSION_KEY_IMAGE_CODE";

    @Autowired
    private ValidateCodeGenerator validateCodeGenerator;

    // private HeaderHttpSessionIdResolver sessionIdResolver = HeaderHttpSessionIdResolver.xAuthToken();

    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = validateCodeGenerator.createImageCode(request);
        ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
    }

}
