package com.zhangshaoliang.www.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/9/3.
 */

@RestController
public class Controller {
    @RequestMapping(value = "/say/{name}", method = RequestMethod.GET)
    public String greeting(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(value = "/main.html", method = RequestMethod.GET)
    public String main() {
        return "This is main page.";
    }

    @RequestMapping(value = "login.html", method = RequestMethod.GET)
    public ModelAndView renderLoginPage(HttpServletRequest request){

        final ModelMap map = new ModelMap();
        map.put("pageName", "loginPage");
        map.put("userId", 666);

        return new ModelAndView("/WEB-INF/pages/login.jsp", map);
    }
}
