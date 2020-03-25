package com.udemy.microservices.limitsservice;

import com.udemy.microservices.limitsservice.config.Config;
import com.udemy.microservices.limitsservice.entity.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
    @Autowired
    private Config config;


    @GetMapping("/limits")
    public LimitConfig getLimitConfiguration(){
        return new LimitConfig(config.getMaximum(),config.getMinimum());
    }
}
