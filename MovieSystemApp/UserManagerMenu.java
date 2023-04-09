package org.example.studies.oopApplications.MovieSystemApp;

import java.util.List;
import java.util.Scanner;

public class UserManagerMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private final UserManager userManager;

    public UserManagerMenu() {
        this.userManager = new UserManager();
    }

    public void run() {

            System.out.println("Choose an operation:");
            System.out.println("1. Add user");
            System.out.println("2. Delete user");
            System.out.println("3. Search users");
            System.out.println("4. Get all users");
            System.out.println("5. Authenticate user");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    searchUsers();
                    break;
                case 4:
                    getAllUsers();
                    break;
                case 5:
                    authenticateUser();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }

    private void addUser() {
        System.out.println("Enter user id: ");
        String id = scanner.nextLine();
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user email: ");
        String email = scanner.nextLine();
        System.out.print("Enter user password: ");
        String password = scanner.nextLine();
        User user = new User(id,name, email, password);
        userManager.addUser(user);
        System.out.println("User added successfully.");
    }

    private void deleteUser() {
        System.out.print("Enter user ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        userManager.deleteUser(id);
    }

    private void searchUsers() {
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();
        List<User> results = userManager.searchUser(query);
        if (results.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("Search results:");
            for (User user : results) {
                System.out.println(user);
            }
        }
    }

    private void getAllUsers() {
        List<User> users = userManager.getAllUsers();
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("All users:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    private void authenticateUser() {
        System.out.print("Enter user email: ");
        String email = scanner.nextLine();
        System.out.print("Enter user password: ");
        String password = scanner.nextLine();
        User user = userManager.authenticateUser(email, password);
        if (user == null) {
            System.out.println("Authentication failed.");
        } else {
            System.out.println("Authentication succeeded. Welcome, " + user.getName() + "!");
        }
    }

}
