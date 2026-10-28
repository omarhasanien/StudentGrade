package edu.zuj.oop.week2.lecture2;
import java.util.Scanner;
public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student name : ");
        String name = input.nextLine();

        System.out.print("Enter student class : ");
        String studentClass = input.nextLine();

        System.out.print("Enter the class section : ");
        String classSection = input.nextLine();

        System.out.print("Enter the student grade (0-100): ");
        int grade = input.nextInt();

        String performance;
        if (grade >= 90) {
            performance = "outstanding";}
         else if (grade >= 80) {performance = "excellent";}
         else if (grade >= 70) {performance = "very good";}
         else if (grade >= 60) {performance = "good";}
         else if (grade >= 50) {performance = "satisfactory";}
         else {performance = "fail";}
        

        System.out.println();
        System.out.println("Student name : " + name);
        System.out.println("Student class : " + studentClass);
        System.out.println("Student section : " + classSection);
        System.out.println("Student grade : " + grade);
        System.out.println("Performance : " + performance);
    }
}
