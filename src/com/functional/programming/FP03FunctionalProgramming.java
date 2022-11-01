package com.functional.programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP03FunctionalProgramming {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        List<String> courses=List.of("Spring", "Spring Boot", "API", "Microservices");
        System.out.println(generateListEvenNumbers(numbers));
        System.out.println(generateListCourseLength(courses));

    }

    private static List<Integer> generateListEvenNumbers(List<Integer> numbers){
       return numbers.stream().filter(number -> number%2==0).collect(Collectors.toList());
    }

    private static List<Integer> generateListCourseLength(List<String> courses){
        return courses.stream().map(String::length).collect(Collectors.toList());

    }




}
