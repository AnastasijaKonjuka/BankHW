package app;

import app.bank.BankController;
import app.users.UserController;

public class AppController {
    public UserController userController = new UserController();
    public BankController bankController = new BankController();

}
