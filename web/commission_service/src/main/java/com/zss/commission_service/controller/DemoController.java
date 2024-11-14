package com.zss.commission_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {
    
    @Value("${example.property}")
    private String exampleProperty;
    
    @GetMapping("/property")
    public String getExampleProperty(){
        
        return exampleProperty;
    }
}
