package com.example.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class PageController {

    //resources-template 하위의 html파일
    @GetMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("main");
    }

}
