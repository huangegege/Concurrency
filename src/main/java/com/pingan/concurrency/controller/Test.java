package com.pingan.concurrency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuhuan
 * 2018/5/14 上午10:59
 */
@Controller
@ResponseBody
public class Test {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
