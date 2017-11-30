package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vortex-11
 */
@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("zhao")
    public String hello(){
        return "hello world!";
    }
}
