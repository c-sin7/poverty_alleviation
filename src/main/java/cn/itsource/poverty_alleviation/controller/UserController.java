package cn.itsource.poverty_alleviation.controller;


import cn.itsource.poverty_alleviation.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Api(tags={"用户信息"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
}
