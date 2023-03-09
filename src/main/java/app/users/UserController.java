package app.users;

import javax.swing.*;
import java.util.ArrayList;

public class UserController {
    public static String action;

    private final ArrayList<User> users = new ArrayList<>();

    public UserController() {
    }

    public String addUser(User user) {
        this.users.add(0, user);
        return "User " + user.getName() + " created";
    }

    public Object welcome() {
        String[] availableActions = {"Login", "SignUp"};
        String action = (String) JOptionPane.showInputDialog(
                null,
                "Hello! Please choose an action to perform",
                "Welcome",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableActions,
                availableActions[0]
        );
        this.action = action;
        return null;
    }

    public String signUp() {
        String name = JOptionPane.showInputDialog("Enter your full name");
        String password = JOptionPane.showInputDialog("Create password");
        Double balance = 0.00;

        String[] availableGenders = {"male", "female"};
        String gender = (String) JOptionPane.showInputDialog(
                null,
                "Select your gender",
                "Gender",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableGenders, //our list of values (measurements)
                availableGenders[0] //which should be shown by default
        );
        User user = new User(name, gender, balance, password);

        this.users.add(user);
        return "User created successfully!";
    }
    public String login() {
        String nameEntered = JOptionPane.showInputDialog("Enter your full name");
        String passwordEntered = JOptionPane.showInputDialog("Enter password");

        //add code to verify user

        String[] availableOperations = {"show balance", "credit", "debit", "logout"};
        String operation = (String) JOptionPane.showInputDialog(
                null,
                "Select Product Measurement",
                "Product Measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableOperations,
                availableOperations[0]
        );
        return operation;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
