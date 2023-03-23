package com.company;
import java.util.Scanner;
public class Sample_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of v");
        float V = sc.nextFloat();
        System.out.println("Enter the value of U");
        float U =sc.nextFloat();
        System.out.println("Enter the value of A");
        float A =sc.nextFloat();
        System.out.println("Enter the value of S");
        float S = sc.nextFloat();
        float Value = (V*V-U*U)/(2*A*S);
        System.out.println(Value);
//        float a =2,s=2,v=8,u=2;
//        Reference Exp
//        float exp =(v*v-u*u)/(2*a*s);
//        System.out.println(exp);
    }
}
