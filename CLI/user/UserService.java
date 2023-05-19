package com.havefunwith.CLI.user;

import com.havefunwith.CLI.car.CarDAO;

public class UserService {

    private UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }

    public void createUser(User user) {
        userDao.saveUser(user);
    }

    public User[] returnUsers() {
        return userDao.getAllUsers();
    }

    public int returnNumberOfTotalUsers() {
        int totalUsers = 0;
        for (User user : userDao.getAllUsers()) {
            if (user != null) totalUsers++;
        }
        return totalUsers;
    }
}
