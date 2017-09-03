package com.zhangshaoliang.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/9/3.
 */

@Controller
@RequestMapping("/api")
public class APIController {
    @RequestMapping(value = "/userInfo.json", method = RequestMethod.GET)
    @ResponseBody
    public Map userInfo() {
        Map map = new HashMap();
        map.put("userId", 666);
        map.put("userName", "Yuri");
        map.put("description", "天气不错");
        return map;
    }
}
