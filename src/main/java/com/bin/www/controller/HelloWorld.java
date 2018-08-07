package com.bin.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Hello")
public class HelloWorld {

    @RequestMapping(value = "/World",method = RequestMethod.GET)
    public ModelAndView HelloWorld() {
        ModelAndView modelAndView =new ModelAndView("/index");
        modelAndView.addObject("name","World");
        return modelAndView;
    }
}
