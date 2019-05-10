package com.angel.security.controller;

import com.angel.security.common.ServerResponse;
import com.angel.security.model.vo.UserVo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JingXiang Bi
 * @date 2019/5/6
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hello")
    public String hello () {
        return "hello";
    }

    /**
     * 获取当前登录用户
     * //@param authentication
     * @return
     */
    @GetMapping("/me")
    public Object getCurrentUser(@AuthenticationPrincipal UserDetails userDetails) {
//        SecurityContextHolder.getContext().getAuthentication()
        return userDetails;
    }

    @GetMapping("/")
    public ServerResponse<List<UserVo>> list() {
        List<UserVo> list = new ArrayList<>();
        list.add(new UserVo());
        list.add(new UserVo());
        list.add(new UserVo());
        return ServerResponse.createBySuccess(list);
    }
}
