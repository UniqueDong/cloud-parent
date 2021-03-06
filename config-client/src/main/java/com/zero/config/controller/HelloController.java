package com.zero.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope cloud config实时刷新
 */
@RefreshScope
@RestController
class HelloController {
    /**
     * 读取配置中心的配置
     */
    @Value("${info.profile}")
    private String test;

    @RequestMapping("/hello")
    public String from() {
        return this.test;
    }
}