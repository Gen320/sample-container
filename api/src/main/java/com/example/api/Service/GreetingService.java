package com.example.api.Service;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.Entity.GreetingEntity;
import com.example.api.Repository.GreetingRepository;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository repository;

    public List<String> findOptionList(){
        List<String> optionList = new ArrayList<>();
        ArrayList<GreetingEntity> entities = (ArrayList<GreetingEntity>) repository.findAll();
        entities.forEach(entity -> optionList.add("{lang: \"" + entity.lang + "\", name: \"" + entity.name + "\""));
        return optionList;
    }

    public String findText(String lang){
        String text = "";
        if(lang != null){
            text = repository.findGreetingByLang(lang).text;
        }
        return text;
    }
}
