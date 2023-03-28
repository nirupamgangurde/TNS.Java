package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 0 for Scissor,1 for paper,2 for stone");
        int input = sc.nextInt();
        Random rd = new Random();
        int a = rd.nextInt(3);
        System.out.println(a);
        if(a==input){
            System.out.println("Match Tie");
        } else if (a==0 && input==1) {
            System.out.println("Scissor wins");
        } else if (a==0 && input==2) {
            System.out.println("Stone wins");
        } else if (a==1 && input==0 ) {
            System.out.println("Scissor wins");
        } else if (a==1 && input==2) {
            System.out.println("Paper wins");
        } else if (a==2 && input==0) {
            System.out.println("Stone wins");
        } else if (a==2 && input==1) {
            System.out.println("Paper wins");
        }
    }
}
