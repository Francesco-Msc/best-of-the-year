package org.lessons.springboot.bestoftheyear.best_of_the_year.models;

public class Songs {
    private int id;
    private String title;
    private String artist;
    private String iframeID;

    public Songs(int id, String title, String artist, String iframeID){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.iframeID = iframeID;
    }
    
    public int getId() {
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
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getIframeID() {
        return iframeID;
    }
    public void setIframeID(String iframeID) {
        this.iframeID = iframeID;
    }
}
