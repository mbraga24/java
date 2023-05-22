package com.havefunwith.CLI.user;

import java.util.Arrays;

public class UserService {

    private UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }

    /**
     * Creates user.
     * @param user
     */
    public void createUser(User user) {
        userDao.saveUser(user);
    }

    /**
     * Return all users.
     * @return users
     */
    public User[] returnUsers() {
        return Arrays.copyOf(userDao.getAllUsers(), this.returnNumberOfTotalUsers());
    }

    /**
     * Returns total number of users.
     * @return int
     */
    public int returnNumberOfTotalUsers() {
        int totalUsers = 0;
        for (User user : userDao.getAllUsers()) {
            if (user != null) totalUsers++;
        }
        return totalUsers;
    }
}
