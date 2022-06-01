package com.test.loginservicenew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @RequestMapping(value = "/fetchCardDetails", method = RequestMethod.GET)
    public String hello() {
        return "hello world!";
    }
}
