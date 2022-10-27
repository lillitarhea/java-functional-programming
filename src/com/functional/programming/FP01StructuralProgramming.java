package com.functional.programming;

import java.util.List;

public class FP01StructuralProgramming {
    public static void main(String args[]){

        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        displayAllNumbersStructurally(numbers);
        displayNumbersEvenStructurally(numbers);


    }

    private static void displayAllNumbersStructurally(List<Integer> numbers){
        for(int i:numbers){
            System.out.println(i);
        }
    }

    private static void displayNumbersEvenStructurally(List<Integer> numbers){
        for(int i:numbers){

            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
