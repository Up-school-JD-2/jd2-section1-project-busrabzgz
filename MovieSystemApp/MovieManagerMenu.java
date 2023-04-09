package org.example.studies.oopApplications.MovieSystemApp;

import java.util.Scanner;

public class MovieManagerMenu {

    private MovieManager movieManager;
    private Movie movie;

    public MovieManagerMenu() {
        movieManager = new MovieManager();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Movie Management Menu");
            System.out.println("1. Add Movie");
            System.out.println("2. Delete Movie");
            System.out.println("3. Search Movie");
            System.out.println("4. Get All Movies");
            System.out.println("5. Print Movie Details");
            System.out.println("6. Perform Transaction");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            switch (choice) {
                case 1:
                    addMovie(scanner);
                    break;
                case 2:
                    deleteMovie(scanner);
                    break;
                case 3:
                    searchMovie(scanner);
                    break;
                case 4:
                    getAllMovies();
                    break;
                case 5:
                    printMovieDetails(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);
        scanner.close();
    }

    private void addMovie(Scanner scanner) {
        System.out.println("Enter movie id:");
        String id=scanner.nextLine();
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie director: ");
        String director = scanner.nextLine();
        System.out.print("Enter movie actors (comma-separated): ");
        String actorsString = scanner.nextLine();
        String[] actors = actorsString.split(",");
        System.out.print("Enter movie release date (yyyy-MM-dd): ");
        String date = scanner.nextLine();
        System.out.print("Enter movie description: ");
        String description = scanner.nextLine();
        System.out.print("Enter movie genre: ");
        String genre = scanner.nextLine();
        Movie movie = new Movie(id,title, director, actors, date, description, genre);
        movieManager.addMovie(movie);
        System.out.println("Movie added.");
    }

    private void deleteMovie(Scanner scanner) {
        System.out.print("Enter movie ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        movieManager.deleteMovie(id);
    }

    private void searchMovie(Scanner scanner) {
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();
        System.out.println("Search results:");
        for (Movie movie : movieManager.searchMovie(query)) {
            System.out.println(movie.getTitle() + " (" + movie.getDirector() + ")");
        }
    }

    private void getAllMovies() {
        System.out.println("All movies:");
        for (Movie movie : movieManager.getAllMovies()) {
            System.out.println(movie.getTitle() + " (" + movie.getDirector() + ")");
        }
    }

    private void printMovieDetails(Scanner scanner) {
        System.out.print("Enter movie ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Movie movie = null;
        for (Movie m : movieManager.getAllMovies()) {
            if (m.getId() == id) {
                movie = m;
                break;
            }
        }
        if (movie != null) {
            movieManager.printMovieDetails(movie);
        } else {
            System.out.println("Movie with ID " + id + " not");
        }
    }
}
