package org.example.studies.oopApplications.MovieSystemApp;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    private String password;
    private String email;


    public User(String id, String name, String password, String email) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.password = password;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Movie> searchMoviesByTitle(String title, List<Movie> movies) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<Movie> searchMoviesByDirector(String director, List<Movie> movies) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector().toLowerCase().contains(director.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }


    public List<Movie> searchMoviesByGenre(String genre, List<Movie> movies) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public void listMovies(List<Movie> movies) {
        System.out.println("All movies:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }
}
