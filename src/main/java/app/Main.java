package app;

import app.users.User;
import app.users.UserController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AppController app = new AppController();

        app.userController.addUser(new User("Bella Jolie", "female", 200.50, "bella123"));
        app.userController.addUser(new User("Jack Chan", "male", 1500.70, "bella567"));
        app.userController.addUser(new User("Dan Jonson", "male", 20.55, "123458"));
        app.userController.addUser(new User("Helen Pitt", "female", 178200.10, "dom123"));
        app.userController.addUser(new User("Emma Ellison", "female", 900.50, "java123"));
        app.userController.addUser(new User("Dom Torreto", "male", 65200.99, "hello123"));

        JOptionPane.showMessageDialog(null, app.userController.welcome());
        if(UserController.action.equals("Login")) {
            JOptionPane.showMessageDialog(null, app.userController.login());
        } else {
            JOptionPane.showMessageDialog(null, app.userController.signUp());
        }

        System.out.println(app.userController.getUsers());

    }
}
