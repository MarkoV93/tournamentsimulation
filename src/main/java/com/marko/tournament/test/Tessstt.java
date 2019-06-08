package com.marko.tournament.test;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tessstt {

    @Scheduled(fixedRate = 2000)
    public void dsd(){
        System.out.println("dsd");
    }
}
