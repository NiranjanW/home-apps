package com.home.niran;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LambdaExample1 {


    public static void logger (Logger logger, Supplier<String> message) {
        if (logger.isLoggable(Level.INFO));
            logger.info(message.get());
    }

    public static void repeat(int n , Runnable action) {
        for(int i =0 ; i <n ; i++) action.run();
    }
}

