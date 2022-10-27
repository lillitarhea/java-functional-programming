package com.functional.programming;

import java.util.List;

public class FP01FunctionalProgramming {
    public static void main(String args[]){

        List<Integer> numbers=List.of(12,15,13,14,1,5,2,3);
        List<String> courses=List.of("Spring", "Spring Boot", "API", "Microservices");
        displayAllNumberFunctionally(numbers);
        displayNumbersEvenFunctionally(numbers);
        displayNumbersOddFunctionally(numbers);


        displayAllCourses(courses);
        displaySpringCourses(courses);
        displayFourCharCourses(courses);

        displayCubeOfOddNumbers(numbers);
        displayNumberOfCharsInCourses(courses);

    }



    private static void displayAllNumberFunctionally(List<Integer> numbers){
        System.out.println("Printing all numbers");
        numbers.stream().forEach(System.out::println);
    }

    private static void displayNumbersEvenFunctionally(List<Integer> numbers){
        System.out.println("Printing only even numbers");
        numbers.stream().filter(number -> number%2==0).forEach(System.out::println);
    }

    private static void displayNumbersOddFunctionally(List<Integer> numbers){
        System.out.println("Printing only odd numbers");
        numbers.stream().filter(number -> number%2!=0).forEach(System.out::println);
    }

    private static void displayAllCourses(List<String> courses){
        System.out.println("Displaying a list of all courses");
        courses.stream().forEach(System.out::println);
    }

    private static void displaySpringCourses(List<String> courses){
        System.out.println("Displaying a list of Spring courses");
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void displayFourCharCourses(List<String> courses){
        System.out.println("Displaying a list of courses with four characters");
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }


    private static void displayCubeOfOddNumbers(List<Integer> numbers){
        System.out.println("Displaying cube of odd numbers");
        numbers.stream()
                .filter(number -> number%2!=0)
                .map(number -> Math.pow(number,3))
                .forEach(System.out::println);

    }

    private static void displayNumberOfCharsInCourses(List<String> courses){
        System.out.println("Displaying number of characters in each course");
        courses.stream()
                .map(course -> course + " " +course.length())
                .forEach(System.out::println);
    }





}
