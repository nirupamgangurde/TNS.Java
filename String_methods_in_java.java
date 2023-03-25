package com.company;

import java.sql.SQLOutput;

public class String_methods_in_java {
    public static void main(String[] args) {
        String name = "Nirupam Bharat Gangurde";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nontrimedstring = "   Nirupam    ";
        String trimedstring = nontrimedstring.trim();
        System.out.println(trimedstring);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('N','A'));
        System.out.println(name.replace("iru","AA"));

        System.out.println(name.startsWith("Niru")); //StartsWith
        System.out.println(name.endsWith("rdex")); //EndsWith

        System.out.println(name.charAt(5)); //character at index no.

        String mystring = "Nirupam";
        System.out.println(mystring.indexOf("rup"));
        System.out.println(mystring.indexOf("rup",2));
        System.out.println(name.indexOf("rup",2));
        System.out.println(mystring.lastIndexOf("ru"));

        System.out.println(mystring.equals("Nirupam"));
        System.out.println(mystring.equals("nirupam"));//Case Sensitive

        System.out.println(mystring.equalsIgnoreCase("nirupam"));
    }
}
