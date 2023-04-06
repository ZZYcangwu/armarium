package com.zzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Filename: TestController
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:30
 * @Description: TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/qqq")
    public String test(){
        return "qqq";
    }
}
