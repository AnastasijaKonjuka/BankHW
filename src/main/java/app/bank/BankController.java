package app.bank;

import app.users.User;

import javax.swing.*;
import java.util.UUID;

public class BankController {

    private Double balance;

    public BankController() {}

    /*
    public String showBalance() {
        balance = User.getBalance();
        return "Your balance is: " + balance;
    }

    public String credit(Double creditAmount, Double balance) {
        balance = User.getBalance();
        creditAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to credit"));
        balance = balance - creditAmount;
        return "Success! " + creditAmount + " is credited.";
    }

    public String debit(Double debitAmount, Double balance) {
        balance = User.getBalance();
        debitAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to debit"));
        balance = balance + debitAmount;
        return "Success! " + debitAmount + " is debited.";
    }

     */

}
