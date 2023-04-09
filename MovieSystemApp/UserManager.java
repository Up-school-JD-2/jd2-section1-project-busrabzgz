package org.example.studies.oopApplications.MovieSystemApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private static final Scanner scanner = new Scanner(System.in);
    private  User user;

    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }


    public void addUser(User user) {

        users.add(user);
    }


    public void deleteUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return;
            }
        }
        System.out.println("User with id " + id + " not found.");
    }


    public List<User> searchUser(String query) {
        List<User> results = new ArrayList<>();
        for (User user : users) {
            if (user.getName().toLowerCase().contains(query.toLowerCase()) || user.getEmail().toLowerCase().contains(query.toLowerCase())) {
                results.add(user);
            }
        }
        return results;
    }


    public List<User> getAllUsers() {
        return users;
    }


    public User authenticateUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


}
