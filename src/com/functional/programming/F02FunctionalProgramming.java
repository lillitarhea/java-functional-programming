package com.functional.programming;

import java.util.List;

public class F02FunctionalProgramming {

    public static void main(String []args){
        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);

        System.out.println(sumInFunctional(numbers));
        System.out.println(sumInFunctionalLambda(numbers));
        System.out.println(sumInStatic(numbers));
        System.out.println(sumInStatic(numbers));
        System.out.println(sumOfSquares(numbers));
        System.out.println(sumOfCubes(numbers));
        System.out.println(sumOfOddCubes(numbers));
    }



    private static int sum(int aggregator, int nextNum){
        return aggregator+nextNum;
    }

    private static int  sumInFunctional(List<Integer> numbers){

        return (numbers.stream().reduce(0, F02FunctionalProgramming::sum));
    }

    private static int  sumInFunctionalLambda(List<Integer> numbers){

        return (numbers.stream().reduce(0, (x, y) -> x+ y));
    }

    private static int sumInStatic(List<Integer> numbers){
        return (numbers.stream().reduce(0, Integer::sum));
    }

    private static int sumOfSquares(List<Integer> numbers){
        return numbers.stream().map(number -> number*number).reduce(0, Integer::sum);
    }

    private static int sumOfCubes(List<Integer> numbers){
        return numbers.stream().map(number -> number*number*number).reduce(0, Integer::sum);
    }

    private static int sumOfOddCubes(List<Integer> numbers){
        return numbers.stream().filter(number -> number%2!=0).map(number-> number*number*number).reduce(0, Integer::sum);
    }
}


