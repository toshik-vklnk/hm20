package com.company;

import java.util.function.BiFunction;

public class CalculatorLite implements BiFunction {


    BiFunction<Integer, Integer, Integer> plus = (x, y) -> {
        return x + y;
    };

    BiFunction<Integer, Integer, Integer> minus = (x, y) -> {
        return x - y;
    };

    BiFunction<Integer, Integer, Integer> divide = (x, y) -> {
        return x / y;
    };

    BiFunction<Integer, Integer, Integer> multiply = (x, y) -> {
        return x * y;
    };

        @Override
        public Object apply(Object o, Object o2) {
            return null;
        }


}
