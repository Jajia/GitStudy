package sean.learngit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        System.out.println("this is master branch");
        return "hello";
    }
}
