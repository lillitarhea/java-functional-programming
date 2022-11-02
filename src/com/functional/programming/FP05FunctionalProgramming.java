package com.functional.programming;

import java.util.List;
import java.util.function.Predicate;

class Course{

     private String name;
     private String category;
     private int reviewScore;
     private int noOfStudents;


    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getCategory() {
         return category;
     }

     public void setCategory(String category) {
         this.category = category;
     }

     public int getReviewScore() {
         return reviewScore;
     }

     public void setReviewScore(int reviewScore) {
         this.reviewScore = reviewScore;
     }

     public int getNoOfStudents() {
         return noOfStudents;
     }

     public void setNoOfStudents(int noOfStudents) {
         this.noOfStudents = noOfStudents;
     }

    @Override
    public String toString() {
        return "name: "+name+" category: "+category+" reviewScore: "+reviewScore+"no. Of Students"+noOfStudents;
    }
}

public class FP05FunctionalProgramming {

     public static void main(String []args){
         List<Course> courseList = List.of(
                 new Course("Spring", "Framework", 95, 2000),
                 new Course("Spring Boot", "Framework", 92, 1000),
                 new Course("Microservices", "Microservices", 91, 200),
                 new Course("API", "Microservices", 95, 100),
                 new Course("AWS", "Cloud", 90, 500)
         );
         Predicate<Course> noOfStudentsGreaterThan500 = course -> course.getNoOfStudents() > 500;
         Predicate<Course> noOfStudentsLesserThan100 =  course -> course.getNoOfStudents() < 100;
         Predicate<Course> noOfStudentsEqualTo500 =  course -> course.getNoOfStudents() == 500;


         System.out.println(courseList.stream().allMatch(noOfStudentsGreaterThan500));
         System.out.println(courseList.stream().noneMatch(noOfStudentsLesserThan100));
         System.out.println(courseList.stream().anyMatch(noOfStudentsEqualTo500));
     }


}
