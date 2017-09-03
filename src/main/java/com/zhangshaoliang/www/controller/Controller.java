package com.zhangshaoliang.www.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/9/3.
 */

@RestController
public class Controller {
    @RequestMapping("/say/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping("/main.html")
    public String main() {
        return "This is main page.";
    }
}
