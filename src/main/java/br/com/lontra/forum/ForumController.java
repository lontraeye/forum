package br.com.lontra.forum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
