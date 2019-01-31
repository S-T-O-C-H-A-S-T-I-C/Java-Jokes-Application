package com.example.JokesApp.manager;

import com.example.JokesApp.sao.CNSao.CNSao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JokesManager {

    @Autowired
    private final CNSao cnSao;

    public JokesManager(final CNSao cnSao) {
        this.cnSao = cnSao;
    }

    public String getJoke() {
        return this.cnSao.getJoke();
    }
}