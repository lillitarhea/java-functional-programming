package com.functional.programming;

import java.util.List;

public class FP01FunctionalProgramming {
    public static void main(String args[]){

        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        displayAllNumberFunctionally(numbers);
        displayNumbersEvenFunctionally(numbers);


    }

    private static void displayAllNumberFunctionally(List<Integer> numbers){
        numbers.stream().forEach(System.out::println);
    }

    private static void displayNumbersEvenFunctionally(List<Integer> numbers){
        numbers.stream().filter(number -> number%2==0).forEach(System.out::println);
    }

}
