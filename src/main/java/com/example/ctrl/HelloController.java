package com.example.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	//@ResponseBody
    @RequestMapping("/hello")
    public ModelAndView hello() {
        return new ModelAndView("hello"); // 根據view resolver mapping至hello.jsp
    }
}