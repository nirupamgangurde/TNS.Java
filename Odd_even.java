package com.company;
import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args) {
        System.out.println("Enter Integer");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");
        }
    }
}
