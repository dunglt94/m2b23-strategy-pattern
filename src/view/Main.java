package view;

import controller.UserController;
import model.User;
import storage.MySQLStorage;
import storage.XMLStorage;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dung");

        XMLStorage xmlStorage = new XMLStorage();
        UserController userController1 = new UserController(xmlStorage);
        userController1.store(user);

        MySQLStorage mySQLStorage = new MySQLStorage();
        UserController userController2 = new UserController(mySQLStorage);
        userController2.store(user);

    }
}
