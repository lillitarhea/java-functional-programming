package com.functional.programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP04FunctionalProgramming {

    public static void main(String []args){
        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        List<Integer> squaredNumbers=behaviourParameterization(numbers, x-> x*x);
        List<Integer> cubedNumbers=behaviourParameterization(numbers, x-> x*x);

    }

    private static int sum(List<Integer> numbers){
        BinaryOperator<Integer> lambda = Integer::sum;
        BinaryOperator<Integer> lambda2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer aggregator, Integer nextNum) {
                return aggregator+nextNum;
            }
        };
        return numbers.stream().reduce(0, lambda2);

    }

    private static List<Integer> behaviourParameterization(List<Integer> numbers, Function<Integer, Integer> funct){
        return numbers.stream().map(funct).collect(Collectors.toList());
    }

}


