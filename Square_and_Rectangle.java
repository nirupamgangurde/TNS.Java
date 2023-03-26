package com.company;
import java.util.Scanner;
public class Square_and_Rectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length");
        int a = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
    }
}
