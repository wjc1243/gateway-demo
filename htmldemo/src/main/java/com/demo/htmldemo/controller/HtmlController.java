package com.demo.htmldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wjc
 * @description: com.demo.controller
 * @date:2019-08-28
 */
@Controller
@RequestMapping("/index")
public class HtmlController {

    @RequestMapping("/htmldemo")
    public String htmldemo(){
        return "demohtml";
    }
}
