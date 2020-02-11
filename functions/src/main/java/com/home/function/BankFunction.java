package com.home.function;

//import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class BankFunction {

    private Object Bank;

//    public enum Currency {
//        DOLLAR, POUND, EURO
//
//    }

    public void accountBalance() {

        Map<Long, Bank> bank = new HashMap<>();

        Function<Long, Bank> findAccount = id -> bank.get(id);

        Function<Bank, Balance> extractBalance = account -> account != null
                ? account.getBalance()
                :new Balance(0., Currency.DOLLAR);


        Function<Balance, Double> toDollars = balance -> {
            if (balance == null) {
                return 0.;
            }
            switch (balance.getCurrency()) {
                case DOLLAR:
                    return balance.getAmount();
                case POUND:
                    return balance.getAmount() * 1.3;
                case EURO:
                    return balance.getAmount() * 1.1;
                default:
                    return 0.;
            }

        };
    }
}