package com.example.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.Entity.GreetingEntity;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface GreetingRepository extends JpaRepository<GreetingEntity, String>{
    List<GreetingEntity> findAll();
    GreetingEntity findGreetingByLang(String lang);
    
}
