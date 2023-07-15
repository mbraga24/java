package com.havefunwith.CLI.user;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final int CAPACITY = 5;
    private static List<User> users;
    private static int nextAvailable = 0;

    static {
        users = new ArrayList<>(CAPACITY);
    }

    /**
     * Saves user.
     * @param user
     */
    public void saveUser(User user) {
        users.add(user);
        nextAvailable++;
    }

    /**
     * Retrieve all users.
     * @return array of users.
     */
    public List<User> getAllUsers() {
        return users;
    }

}
