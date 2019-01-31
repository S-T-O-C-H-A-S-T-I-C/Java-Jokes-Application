package com.example.JokesApp.controllers.jokes;

import com.example.JokesApp.manager.JokesManager;
import com.example.JokesApp.sao.CNSao.CNSao;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    private final JokesManager jokesManager;

    public JokesController(final JokesManager jokesManager) {
        this.jokesManager = jokesManager;
    }

    @RequestMapping({"/", ""})
    public String showJoke(final Model model) {
        model.addAttribute("joke", this.jokesManager.getJoke());
        return "ChuckNorris";
    }
}
