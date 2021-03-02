package com.company;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Apple", "apple");

        squaring();
        System.out.println(predicat(list));

        CalculatorLite calculatorLite = new CalculatorLite();
        Map<MathOperations, BiFunction> map = new HashMap();
        map.put(MathOperations.PLUS, calculatorLite.plus);
        map.put(MathOperations.MINUS, calculatorLite.minus);
        map.put(MathOperations.DIVIDE, calculatorLite.divide);
        map.put(MathOperations.MULTIPLY, calculatorLite.multiply);

        System.out.println(map.get(MathOperations.PLUS).apply(5,2));
        System.out.println(map.get(MathOperations.MINUS).apply(5,2));
        System.out.println(map.get(MathOperations.DIVIDE).apply(5,2));
        System.out.println(map.get(MathOperations.MULTIPLY).apply(5,2));
    }

    public static void squaring() {

        List<Integer> list = Stream.of(1,2,3,4,5).filter(x -> x % 2 ==0).map(x -> x * x).collect(Collectors.toList());
        System.out.println(list);

    }

    public static boolean predicat(List<String> list) {
        boolean res;

        long count = list.stream().filter(s -> {
            char firstChar = s.charAt(0);
            if (firstChar == toUpperCase(firstChar)) return true;
            else return false;
        }).count();
        if (count >= 2) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

}
