package org.lessons.springboot.bestoftheyear.best_of_the_year.service;

import java.util.Arrays;
import java.util.List;

import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Movies;
import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Songs;
import org.springframework.stereotype.Service;

@Service
public class Details {
    
    private static List<Songs> bestSongs(){
        return Arrays.asList(
            new Songs(1, "Creep", "Radiohead", "XFkzRNyygfk"),
            new Songs(2, "Numb", "Linkin Park", "kXYiU_JCYtU"),
            new Songs(3, "21 Guns", "Green Day", "r00ikilDxW4")
            );
    }

    private static List<Movies> bestMovies(){
        return Arrays.asList(
            new Movies(1, "Interstellar", "Sci-fi/Avventura", "2h 49m"),
            new Movies(2, "Dune", "Sci-fi/Avventura", "2h 35m"),
            new Movies(3, "Spider-Man: No Way Home", "Azione/Sci-fi", "2h 28m")
            );
    }

    public static List<Songs> getBestSongs(){
        return bestSongs();
    }

    public static List<Movies> getBestMovies(){
        return bestMovies();
    }


    public static Songs getSongByID(List<Songs> songs, int id){
        Songs chosenSong = null;
        for (Songs song : songs) {
            if (song.getId() == id) {
                chosenSong = song;
                break;
            }
        }
        return chosenSong;
    }

    public static Movies getMovieByID(List<Movies> movies, int id){
        Movies chosenMovie = null;
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                chosenMovie = movie;
                break;
            }
        }
        return chosenMovie;
    }
}