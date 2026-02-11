package com.venkatesh.bank.service;

import com.venkatesh.bank.exception.UserNotFoundException;
import com.venkatesh.bank.model.User;
import com.venkatesh.bank.exception.IllegalEmailException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<Integer, User> users;
    private final Map<String, User> usersByEmail;
    private int nextId;

    public UserService() {
        users = new HashMap<>();
        usersByEmail = new HashMap<>();
        this.nextId = 1;
    }

    public boolean isValidEmail(String email) {
        if (email == null) return false;

        email = email.trim().toLowerCase();
        String regexPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regexPattern);
    }

    public User createUser (String name, String email) {
        if (!isValidEmail(email))
            throw new IllegalEmailException("Please enter valid email.");

        if (usersByEmail.containsKey(email))
            throw new IllegalArgumentException("Email already exists");

        User user = new User(nextId, name, email);
        users.put(nextId, user);
        usersByEmail.put(email, user);
        nextId++;
        return user;
    }

    public User getUserById(int id) throws UserNotFoundException {
        User user = users.get(id);
        if (user == null)
            throw new UserNotFoundException("User with id: " + id +" not found");
        return user;
    }

}
