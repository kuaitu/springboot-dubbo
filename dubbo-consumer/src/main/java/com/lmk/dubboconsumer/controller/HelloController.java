package com.lmk.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lmk.dubbointerface.hello.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = { "测试模块" })
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @ApiOperation("获取hello")
    @GetMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("SnailClimb"));
        return hello;
    }
}
