package com.lin.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "querydemo", method = RequestMethod.GET)
public class QueryDemoController {

    @RequestMapping(value = "/get")
    public String demoQuery() {
        return "asdfasdf";
    }
}
