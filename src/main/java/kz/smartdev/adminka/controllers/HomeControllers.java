package kz.smartdev.adminka.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeControllers {
    @GetMapping("/index")
    public  String index(){
        return  "index page";
    }
}
