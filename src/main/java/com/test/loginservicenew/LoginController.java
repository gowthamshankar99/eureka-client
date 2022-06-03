package com.test.loginservicenew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoginController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/fetchCardDetails", method = RequestMethod.GET)
    public String hello() {

        String response = restTemplate.getForObject("http://order-service/order/order/user", String.class);
        return response + " - data from order service";
    }
}
