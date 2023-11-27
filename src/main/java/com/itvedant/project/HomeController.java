package com.itvedant.project;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String index() 
    {
        return "index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "about.html";
    }
    @RequestMapping("/product")
    public String product()
{
     return "product.html";
}
}