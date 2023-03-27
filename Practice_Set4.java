package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Practice_Set4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question no 1
//        System.out.println("Enter Integer");
//        int a = sc.nextInt();
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }
//        Question no = 2
//        System.out.println("Enter marks of M1");
//        float M1 = sc.nextFloat();
//        System.out.println("Enter marks of M2");
//        float M2 = sc.nextFloat();
//        System.out.println("Enter marks of M3");
//        float M3 = sc.nextFloat();
//        System.out.println("Enter marks of M4");
//        float M4 = sc.nextFloat();
//        System.out.println("Enter marks of M5");
//        float M5 = sc.nextFloat();
//        float scored_marks = (M1+M2+M3+M4+M5);
//        float max_marks = 500;
//        float percentage = ((scored_marks/max_marks)*100);
//        System.out.println("Candidate got "+percentage+" out of 100");
//
//        if(percentage>=30 && M1>=33 && M2>=33 && M3>=33 && M4>=33 && M5>=33){
//            System.out.println("You Pass the Exam");
//        }
//        else{
//            System.out.println("You Fail the Exam");
//        }
        System.out.println("Enter your income in LPA");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.50){
            tax = tax + 0;
        }
        else if(income>2.5f && income<5.0f){
            tax =tax + 0.05f*(income-2.50f);
        }
        else if(income>5.0f && income<10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.05f*(10.0f-5f);
            tax = tax + 0.3f*(income-10.0f);
        }
        System.out.println("Total Tax paid by the employee is "+ tax);
    }
}
