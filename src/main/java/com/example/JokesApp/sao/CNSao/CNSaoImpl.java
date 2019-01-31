package com.example.JokesApp.sao.CNSao;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class CNSaoImpl implements CNSao {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public CNSaoImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}