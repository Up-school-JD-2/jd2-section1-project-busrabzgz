package org.example.studies.oopApplications.MovieSystemApp;

public class Movie {

    private int id;
    private String title;
    private String director;
    private String[] actors;
    private String date;
    private String description;
    private String genre;

    // Constructor
    public Movie(String id, String title, String director, String[] actors, String date, String description, String genre) {
        this.id = Integer.parseInt(id);
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.date = date;
        this.description = description;
        this.genre = genre;
    }

    // Getters and setters
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
