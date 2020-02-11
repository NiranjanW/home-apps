package com.home.niran;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String[] args) {

        Stream words = Stream.of("Hi" , "Hello", " Ola").distinct();
        words.forEach(System.out::println);
//        words.forEach( word -> System.out.println(word));



    }

    public static Optional<Double> squareRoot (Double x){

            return x <0 ? Optional.empty():Optional.of(Math.sqrt(x));
    }
}
