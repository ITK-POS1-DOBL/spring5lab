package org.doblander.itk.pos1.spring5lab.controllers;

import org.doblander.itk.pos1.spring5lab.services.SimpleHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    private SimpleHelloService simpleHelloService;

    public HelloController(SimpleHelloService simpleHelloService) {
        this.simpleHelloService = simpleHelloService;
    }

    @RequestMapping("/person")
    public String sayHello(Model model) {

        System.out.println("Hello - from controller!");

        model.addAttribute("greeting", simpleHelloService.sayGreeting());

        return "hello";
    }
}
