package sean.learngit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("master");
        System.out.println("testing5");
        System.out.println("testing7");
        System.out.println("testing6");
        return "hello";
    }
}
