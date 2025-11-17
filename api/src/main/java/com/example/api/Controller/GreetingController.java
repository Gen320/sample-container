package com.example.api.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.api.Service.GreetingService;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @Autowired
    private GreetingService service;

    @RequestMapping("/options")
    public Map<String, String> options(){
        Map<String, String> optionMap = null;
        optionMap = service.findOptionMap();
        return optionMap;
    }
    
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(required = false) String lang){
        String text = " ";
        if(!lang.isEmpty() || lang != null){
            text = service.findText(lang);
        }
        return text;
    }

}
