package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class Practice_set_3 {
    public static void main(String[] args) {
//        Example 1
        String name= "My Name is Nirupam";
        String name1 = name.toLowerCase();
        System.out.println(name1);

//        Example 2
        String name2 = name.replace(' ','_');
        System.out.println(name2);

//        Example 3
        String name3 = "Nirupam";
        System.out.printf("Dear "+name3+" Thanks alot");
        System.out.println();
        System.out.printf("Dear %s thanks alot",name3);
        System.out.println();

//        Example 4
        String name4 = "This sentence contains double  and triple   spaces";
        System.out.println(name4.indexOf("  "));
        System.out.println(name4.indexOf("   "));

//        Exsmple 5
        String letter = "Hello TNS,\n\tThis java Course is nice,\n\tThanks!";// \n for new line and \t for tab.
        System.out.println(letter);
    }
}
