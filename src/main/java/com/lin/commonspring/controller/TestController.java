package com.lin.commonspring.controller;


import com.lin.commonspring.exception.GeneralErrorException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        String result = null;
        while (true) {
            throw new GeneralErrorException(200000, "error");
        }
    }
}
