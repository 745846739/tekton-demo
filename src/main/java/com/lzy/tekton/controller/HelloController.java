package com.lzy.tekton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {
    @GetMapping("/hello1")
    @ResponseBody
    public String hello(){
        return "hello1";
    }
}
