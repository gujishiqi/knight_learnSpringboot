package com.zc.knight.knight.start.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  孤寂十七
 * date    2018-01-22
 * description
 */

@RestController
@RequestMapping(value = "/start")
public class HelloWorldController {

    @GetMapping(value="hello")
    public String start(){
        return "hello world";
    }
}
