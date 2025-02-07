package org.lessons.springboot.bestoftheyear.best_of_the_year.controller;

import java.util.Arrays;
import java.util.List;

import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Movies;
import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
public class PageController {
    
    @GetMapping("/")
    public String index(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("movies", getBestMovies());
        model.addAttribute("songs", getBestSongs());
        return "index";
    }

    private List<Movies> getBestMovies(){
        return Arrays.asList(new Movies(1, "Interstellar"));
    }

    private List<Songs> getBestSongs(){
        return Arrays.asList(new Songs(1, "Never gonna give you up"));
    }

    @GetMapping("/movies")
    public String movies(Model model){
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }
}
