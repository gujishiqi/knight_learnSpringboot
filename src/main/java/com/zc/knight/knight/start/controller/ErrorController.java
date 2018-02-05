package com.zc.knight.knight.start.controller;

import com.zc.knight.knight.restful.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/error")
public class ErrorController {


        @GetMapping(value="404")
        public Object error404(){

            return new ResponseBean(203, "未授权",null);

    }
}
