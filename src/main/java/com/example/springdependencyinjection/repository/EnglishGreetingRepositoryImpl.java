package com.example.springdependencyinjection.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - ENGLISH";
    }
}
