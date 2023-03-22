package com.company;
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max marks");
        int max_marks = sc.nextInt();
        System.out.println("Enter marks of English");
        int English = sc.nextInt();
        System.out.println("Enter marks of Marathi");
        int Marathi = sc.nextInt();
        System.out.println("Enter marks of Science");
        int science = sc.nextInt();
        System.out.println("Enter marks of Maths");
        int Maths = sc.nextInt();
        System.out.println("Enter marks of Hindi");
        int Hindi = sc.nextInt();
        int total_marks = (English+Marathi+science+Maths+Hindi);
        System.out.println("Total Marks is "+total_marks);
        int max_score= 5*max_marks;
        System.out.println("max Score is "+max_score);
        float percentage = total_marks/max_score*100;
        System.out.println("Total percentage is");
        System.out.println(percentage);
    }
}
