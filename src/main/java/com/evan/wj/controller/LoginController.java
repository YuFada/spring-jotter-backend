package com.evan.wj.controller;

import com.evan.wj.entity.User;
import com.evan.wj.result.Result;
import com.evan.wj.result.ResultFactory;
import com.evan.wj.service.UserService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

/**
 * @author fada.yu
 * @date 2020/8/21 11:20
 * @Description：
 */
@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping(value = "api/register")
    @ResponseBody
    public Result register(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);
        boolean exist = userService.isExist(username);
        if (exist) {
            String message = "用户名已经被使用";
            return ResultFactory.buildFailResult(message);
        }
        //生成盐 默认长度 16位
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        //设置 hase迭代次数
        int times = 2;
        String encodePassword = new SimpleHash("md5", password, salt, times).toString().toString();
        user.setSalt(salt);
        user.setPassword(encodePassword);
        userService.add(user);
        return ResultFactory.buildSuccessResult(user);


    }

    @CrossOrigin
    @RequestMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }

}
