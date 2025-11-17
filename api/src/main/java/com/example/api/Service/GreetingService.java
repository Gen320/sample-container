package com.example.api.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.Entity.GreetingEntity;
import com.example.api.Repository.GreetingRepository;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository repository;

    public Map<String, String> findOptionMap(){
        Map<String, String> optionMap = new HashMap<>();
        ArrayList<GreetingEntity> entities = (ArrayList<GreetingEntity>) repository.findAll();
        entities.forEach(entity -> optionMap.put(entity.lang, entity.name));
        return optionMap;
    }

    public String findText(String lang){
        String text = repository.findGreetingByLang(lang).text;
        
        return text;
    }
}
