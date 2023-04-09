package org.example.studies.oopApplications.MovieSystemApp;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private Movie movie;


    private List<Movie> movies;

    public MovieManager() {
        movies = new ArrayList<>();
    }


    public void addMovie(Movie movie) {
        movies.add(movie);
    }


    public void deleteMovie(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                movies.remove(movie);
                return;
            }
        }
        System.out.println("Movie with id " + id + " not found.");
    }


    public List<Movie> searchMovie(String query) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(query.toLowerCase()) || movie.getDirector().toLowerCase().contains(query.toLowerCase())) {
                results.add(movie);
            }
        }
        return results;
    }


    public List<Movie> getAllMovies() {
        return movies;
    }


    public void printMovieDetails(Movie movie) {
        System.out.println("ID: " + movie.getId());
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + String.join(", ", movie.getActors()));
        System.out.println("Date: " + movie.getDate());
        System.out.println("Description: " + movie.getDescription());
        System.out.println("Genre: " + movie.getGenre());
    }



}
