package com.home.niran;

public class Customer implements  Runnable {

    @Override
    public void run() {
        Bank bank = Bank.getInstance();
        BankAccount account = bank.getAccount(123456);
//        account.deposit(100);
//        account.withdraw(200);

        // obtain a lock on the account before performing operations
        synchronized (account) {
            account.deposit(100);
            account.withdraw(200);
        }
    }

        public static void main(String[] args) {
            Customer customer1 = new Customer();
            Customer customer2 = new Customer();
            Thread t1 = new Thread(customer1);
            Thread t2 = new Thread(customer2);
            t1.setName("Customer-1");
            t2.setName("Customer-2");
            t1.start();
            t2.start();
        }


}
