package com.orzech.chucknorrisjokes.services;

import com.orzech.chucknorrisjokes.model.JokeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeReturnService {
    private final JokeGenerator jokeGenerator;

    @Autowired
    public JokeReturnService(JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    public String getJoke() {
        return jokeGenerator.getRandomQuote();
    }
}
