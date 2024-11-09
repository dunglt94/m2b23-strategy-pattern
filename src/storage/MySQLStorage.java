package storage;

import model.User;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("User " + user.getName() + " stored in MySQL.");
    }
}
