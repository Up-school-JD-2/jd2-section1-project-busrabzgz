package org.example.studies.oopApplications.MovieSystemApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMenu {
    private User user;
    private UserManager userManager;

    private List<Movie> movies;

    public UserMenu(UserManager userManager) {
        this.userManager = userManager;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Welcome to the User Manager!");
            System.out.println("Please select an option:");
            System.out.println("1. Add a user");
            System.out.println("2. Delete a user");
            System.out.println("3. Search for a user");
            System.out.println("4. List all users");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    searchUser();
                    break;
                case 4:
                    listUsers();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

    }

    private void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter user details:");

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Password: ");
        String password = scanner.next();

        System.out.print("Email: ");
        String email = scanner.next();

        User user = new User(id, name, password, email);
        userManager.addUser(user);

        System.out.println("User added successfully!");
    }

    private void deleteUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the ID of the user you want to delete: ");
        int id = scanner.nextInt();

        userManager.deleteUser(id);

        System.out.println("User deleted successfully!");
    }

    private void searchUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a search query: ");
        String query = scanner.next();

        List<User> results = userManager.searchUser(query);

        if (results.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("Search results:");
            for (User user : results) {
                System.out.println(user.getName() + " (" + user.getEmail() + ")");
            }
        }
    }

    private void listUsers() {
        List<User> users = userManager.getAllUsers();

        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("All users:");
            for (User user : users) {
                System.out.println(user.getName() + " (" + user.getEmail() + ")");
            }
        }
    }
}

