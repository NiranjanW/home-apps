package com.home.function;

public class Bank {
    private  static int id;
    private String account;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Bank.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public Bank ( double initlaBalance) {

        balance = initlaBalance;
    }

}
