package com.example.springdependencyinjection.service;


import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating a Singleton bean...");
    }

    public String getMyScope(){
        return "I am a Singleton";
    }
}
