package com.functional.programming;

import java.util.List;

public class FP02StructuralProgramming {

    public static void main(String []args){
        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        System.out.println(sumInStructural(numbers));
    }

    private static int sumInStructural(List <Integer> numbers){
        int sum=0;
        for(int number: numbers){
          sum=sum+number;

        }
        return sum;
    }


}
