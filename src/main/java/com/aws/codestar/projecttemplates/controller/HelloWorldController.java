package com.aws.codestar.projecttemplates.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    private final String siteName;
    private Random random = new Random();

    public HelloWorldController(final String siteName) {
        this.siteName = siteName;
    }

    @GetMapping()
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
    @GetMapping("/number")
    public Integer getRandomNumber(){
        return random.nextInt(1000);
    }

}
