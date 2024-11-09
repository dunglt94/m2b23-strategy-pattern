package controller;

import model.User;
import storage.UserStorage;

public class UserController implements UserStorage {
    private UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public void store(User user) {
        userStorage.store(user);
    }
}
