package org.lessons.springboot.bestoftheyear.best_of_the_year.models;

public class Movies {
    private int id;
    private String title;
    private String genre;
    private String duration;

    public Movies(int id, String title, String genre, String duration){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
