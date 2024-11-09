package storage;

import model.User;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("User " + user.getName() + " stored in file.xml");
    }
}
