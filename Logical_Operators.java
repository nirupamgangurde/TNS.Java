package com.company;

public class Logical_Operators {
    public static void main(String[] args) {
//        AND(&&) operator
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

//        OR() Operator
        boolean a1 = true;
        boolean b1 = false;
        if(a1||b1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

//        NOT Operator
        System.out.println("Not(a1) is "+a1);
        System.out.println("Not(b2) is "+b1);
    }
}
