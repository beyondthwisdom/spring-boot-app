package com.btw.firstproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

   @RequestMapping("/hello")
   public String hello(){
    return "Hello World";
   }

}