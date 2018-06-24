package com.robert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class Controller {

    @RequestMapping("/tokentest")
    public String tokenTest(){
        return  "tokenTest";
    }
}
