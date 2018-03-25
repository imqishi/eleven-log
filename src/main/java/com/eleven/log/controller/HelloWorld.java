package com.eleven.log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qishi on 2018/3/25.
 */

@Controller
@RequestMapping(value = "/")
public class HelloWorld {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
