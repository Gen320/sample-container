package com.example.api.Controller;



import java.util.List;
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
    public List<String> options(){
        List<String> optionList = null;
        optionList = service.findOptionList();
        return optionList;
    }
    
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(required = false) String lang){
        String text = service.findText(lang);
        return text;
    }

}
