package model;

public class BankAccount {
    private int id;
    private String userName;
    private double balance;
    public BankAccount(int id, String userName, double balance) {
        this.id = id;
        this.userName = userName;
        this.balance = balance;

    }
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
            }
}
