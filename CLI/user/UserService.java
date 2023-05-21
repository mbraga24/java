package com.havefunwith.CLI.user;

public class UserService {

    private UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }

    /**
     * Creates user.
     * @param user to be saved.
     */
    public void createUser(User user) {
        userDao.saveUser(user);
    }

    /**
     * Return all users.
     * @return array of users.
     */
    public User[] returnUsers() {
        return userDao.getAllUsers();
    }

    /**
     * Returns total number of users.
     * @return integer.
     */
    public int returnNumberOfTotalUsers() {
        int totalUsers = 0;
        for (User user : userDao.getAllUsers()) {
            if (user != null) totalUsers++;
        }
        return totalUsers;
    }
}
