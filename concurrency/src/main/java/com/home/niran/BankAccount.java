package com.home.niran;

public class BankAccount {
    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    private Integer accountNo;
    private Integer balance;

    public BankAccount(Integer accountNumber) {
        this(accountNumber, 0);
    }


    public BankAccount(Integer accountNo , Integer initialBalance) {

        this.accountNo = accountNo;
        balance = initialBalance;
    }

    public void deposit(Integer amt){
        balance = balance + amt;
        System.out.println(Thread.currentThread().getName()  + "depositing amnt" + amt);
    }

    public Integer withdraw(Integer amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount + " from the account " + accountNo);
        if (balance < amount) {
            System.out.println("OOPS, NO BALANCE LEFT TO WITHDRAW FOR "+Thread.currentThread().getName());
            return 0;
        }
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " successfully withdrow the amount. balance left =  " + balance);
        return amount;
    }
}
