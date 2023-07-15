package com.havefunwith.CLI.user;

import java.util.Arrays;
import java.util.List;

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
    public List<User> returnUsers() {
//        return Arrays.copyOf(userDao.getAllUsers(), this.returnNumberOfTotalUsers());
        return userDao.getAllUsers();
    }

    /**
     * Returns total number of users.
     * @return int
     */
//    public int returnNumberOfTotalUsers() {
//        int totalUsers = 0;
//        for (User user : userDao.getAllUsers()) {
//            if (user != null) totalUsers++;
//        }
//        return totalUsers;
//    }

    /**
     * Left code comment for ease understanding of code refactoring implemented.
     * I would delete commented code in a production environment.
     */
}
