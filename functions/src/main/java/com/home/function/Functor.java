package com.home.function;

import java.util.function.Function;

public interface Functor<T,F extends Functor<?,?>> {
//    <R> F Functor  map (Function<T , R> f);
    <R> F map(Function<T, R> f);

}

class Identity<T> implements Functor <T, Identity<?>> {
     private final T value;

    Identity(T value) { this.value = value; }
    @Override
    public <R> Identity<R> map(Function<T, R> f) {
        final R result = f.apply(value);
        return new Identity<>(result);
    }


//    class Identity<T> implements Functor<T,Identity<?>> {
//        private final T value;
//        Identity(T value) { this.value = value; }
//        public <R> Identity<R> map(Function<T,R> f) {
//            final R result = f.apply(value);
//            return new Identity<>(result);
//        }
}