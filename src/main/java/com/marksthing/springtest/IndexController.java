package com.marksthing.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/hello")
    public String home() {
        return "nottheindex.jsp";
    }
}