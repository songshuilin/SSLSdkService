package com.sslsdk.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:18
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
         throw new NullPointerException();
    }
}
