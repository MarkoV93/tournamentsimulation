package com.marko.tournament;


import com.marko.tournament.entity.User;
import com.marko.tournament.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Launcher {
    private final UserRepository r;

    @Autowired
    public Launcher(UserRepository r) {
        this.r = r;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

}
