package br.com.frb.sgportfolios.infrastructure.controllers.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", "Hello Faber!!");

        return "welcome";
    }

    @RequestMapping("/about")
    public String foo() {
        return "about_page";
    }
}
