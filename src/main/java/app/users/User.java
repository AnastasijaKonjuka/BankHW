package app.users;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String gender;
    private Double balance;
    private String password;

    public User(UUID id, String name, String gender, Double balance, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.balance = balance;
        this.password = password;
    }

    public User(String name, String gender, Double balance, String password) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
        this.balance = balance;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
