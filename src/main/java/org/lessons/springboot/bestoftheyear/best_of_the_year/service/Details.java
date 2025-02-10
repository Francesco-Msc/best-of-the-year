package org.lessons.springboot.bestoftheyear.best_of_the_year.service;

import java.util.ArrayList;
import java.util.List;

import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Movies;
import org.lessons.springboot.bestoftheyear.best_of_the_year.models.Songs;
import org.springframework.stereotype.Service;

@Service
public class Details {
    
    private List<Songs> bestSongs(){
        List<Songs> songList = new ArrayList<>();
            songList.add(new Songs(1, "Creep", "Radiohead", "XFkzRNyygfk"));
            songList.add(new Songs(2, "Numb", "Linkin Park", "kXYiU_JCYtU"));
            songList.add(new Songs(3, "21 Guns", "Green Day", "r00ikilDxW4"));
            songList.add(new Songs(4, "Now I Know Their Name", "Paolo Mosca", "0a9BqkhtPo0"));
            return songList;
    }

    private List<Movies> bestMovies(){
        List<Movies> movieList = new ArrayList<>();
            movieList.add(new Movies(1, "Interstellar", "Sci-fi/Avventura", "2h 49m"));
            movieList.add(new Movies(2, "Dune", "Sci-fi/Avventura", "2h 35m"));
            movieList.add(new Movies(3, "Spider-Man: No Way Home", "Azione/Sci-fi", "2h 28m"));
            movieList.add(new Movies(4, "Il Signore degli Anelli - La Compagnia dell'Anello", "Fantastico/Avventura", "2h 58m"));
            movieList.add(new Movies(5, "Matrix", "Azione/Sci-fi", "2h 16m"));
            movieList.add(new Movies(6, "Una notte da leoni", "Commedia/Avventura", "1h 40m"));
            return movieList;
    }

    public List<Songs> getBestSongs(){
        return bestSongs();
    }

    public List<Movies> getBestMovies(){
        return bestMovies();
    }


    public Songs getSongByID(List<Songs> songs, int id){
        Songs chosenSong = null;
        for (Songs song : songs) {
            if (song.getId() == id) {
                chosenSong = song;
                break;
            }
        }
        return chosenSong;
    }

    public Movies getMovieByID(List<Movies> movies, int id){
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