package com.start.start.controller;

import com.start.start.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *   HandlerMethodArgumentResolverComposite
 *
 *   RequestMappingHandlerAdapter
 *
 *   DispatcherServlet
 *
 *   HandlerMethodArgumentResolverComposite
 *
 *   InvocableHandlerMethod
 *
 *   ServletInvocableHandlerMethod
 *
 *
 *
 */


@RestController
public class TestController {
    @PostMapping("/user")
    public User user(User user) {
        return user;
    }

}
