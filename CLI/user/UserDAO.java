package com.havefunwith.CLI.user;

/**
 * Default class only accessed within this package.
 */
class UserDAO {

    private static final int CAPACITY = 5;
    private static User[] users;
    private static int nextAvailable = 0;

    static {
        users = new User[CAPACITY];
    }

    public void saveUser(User user) {
        users[nextAvailable] = user;
        nextAvailable++;
    }

    public User[] getAllUsers() {
        return users;
    }

}
