package main;

import java.util.ArrayList;
 
class Student {
     private String name;
     private int age;
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
}
 
public class Question015 {
     public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<>();
         students.add(new Student("James", 25));
         students.add(new Student("James", 27));
         students.add(new Student("James", 25));
         students.add(new Student("James", 25));
 
         students.remove(new Student("James", 25));
 
         for(Student stud : students) {
             System.out.println(stud);
         }
     }
}