package org.example.studies.oopApplications.MovieSystemApp;

import java.awt.*;
import java.util.Scanner;

public class MainMenu {
    private static MovieManager movieManager;



    public static void main(String[] args) {

            Movie movie1 = new Movie("1", "The Shawshank Redemption", "Frank Darabont", new String[]{"Tim Robbins, Morgan Freeman"},
                    "1994-09-23", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", "Drama");
            Movie movie2 = new Movie("2", "The Godfather", "Francis Ford Coppola", new String[]{"Marlon Brando, Al Pacino, James Caan"},
                    "1972-03-24", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", "Crime");

            // Create a movie manager and add the movie objects

            movieManager.addMovie(movie1);
            movieManager.addMovie(movie2);

            // Create some user objects
            User user1 = new User("1", "John Doe", "password123", "johndoe@gmail.com");
            User user2 = new User("2", "Jane Doe", "password456", "janedoe@gmail.com");

//            // Create a user manager and add the user objects
            UserManager userManager = new UserManager();
            userManager.addUser(user1);
            userManager.addUser(user2);



            System.out.println("Welcome to the Movie Management System!");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please select your role:");
            System.out.println("1. User");
            System.out.println("2. User Manager");
            System.out.println("3. Movie Manager");
            System.out.println("4.Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                  UserMenu userMenu=new UserMenu(userManager);
                    userMenu.run();
                    break;
                case 2:
                    UserManagerMenu userManagerMenu=new UserManagerMenu();
                    userManagerMenu.run();
                    break;
                case 3:
                    MovieManagerMenu movieManagerMenu=new MovieManagerMenu();
                    movieManagerMenu.run();

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }



}
