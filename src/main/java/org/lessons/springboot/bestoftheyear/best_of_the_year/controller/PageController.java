package org.lessons.springboot.bestoftheyear.best_of_the_year.controller;

import java.util.Arrays;
import java.util.List;

import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Movies;
import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Songs;
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
    public String index(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("movies", getBestMovies());
        model.addAttribute("songs", getBestSongs());
        return "index";
    }

    private List<Movies> getBestMovies(){
        return Arrays.asList(
            new Movies(1, "Interstellar", "Sci-fi/Avventura", "2h 49m"),
            new Movies(2, "Dune", "Sci-fi/Avventura", "2h 35m"),
            new Movies(3, "Spider-Man: No Way Home", "Azione/Sci-fi", "2h 28m")
            );
    }

    private List<Songs> getBestSongs(){
        return Arrays.asList(
            new Songs(1, "Creep", "Radiohead", "XFkzRNyygfk"),
            new Songs(2, "Numb", "Linkin Park", "kXYiU_JCYtU"),
            new Songs(3, "21 Guns", "Green Day", "r00ikilDxW4")
            );
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

    @GetMapping("/movies/{id}")
    public String movieDetails(@PathVariable int id, Model model){
        List<Movies> movies = getBestMovies();

        Movies chosenMovie = null;
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                chosenMovie = movie;
                break;
            }
        }
        model.addAttribute("movie", chosenMovie);
        return "movieDetails";
    }

    @GetMapping("/songs/{id}")
    public String songDetails(@PathVariable int id, Model model){
        List<Songs> songs = getBestSongs();

        Songs chosenSong = null;
        for (Songs song : songs) {
            if (song.getId() == id) {
                chosenSong = song;
                break;
            }
        }
        model.addAttribute("song", chosenSong);
        return "songDetails";
    }
}
