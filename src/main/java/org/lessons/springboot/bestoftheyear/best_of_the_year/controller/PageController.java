package org.lessons.springboot.bestoftheyear.best_of_the_year.controller;

import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Movies;
import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Songs;
import org.lessons.springboot.bestoftheyear.best_of_the_year.service.Details;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
public class PageController {
    
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Guest") String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("movies", Details.getBestMovies());
        model.addAttribute("songs", Details.getBestSongs());
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model){
        model.addAttribute("movies", Details.getBestMovies());
        model.addAttribute("title", "Best Movies");
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        model.addAttribute("songs", Details.getBestSongs());
        model.addAttribute("title", "Best Songs");
        return "songs";
    }

    @GetMapping("/movies/{id}")
    public String movieDetails(@PathVariable int id, Model model){
        Movies chosenMovie = Details.getMovieByID(Details.getBestMovies(), id);
        model.addAttribute("movie", chosenMovie);
        return "movieDetails";
    }

    @GetMapping("/songs/{id}")
    public String songDetails(@PathVariable int id, Model model){
        Songs chosenSongs = Details.getSongByID(Details.getBestSongs(), id);
        model.addAttribute("song", chosenSongs);
        return "songDetails";
    }
}