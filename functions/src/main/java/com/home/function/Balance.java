package com.home.function;

public class Balance {

    public Balance(double amt, Currency dollar) {
    }

    public enum Currency { DOLLAR, POUND, EURO};

    public Balance(double  amt, String currency) {
        this.currency = currency;
    }

    String currency;

    public String getCurrency(){
        return currency;
    }
}
