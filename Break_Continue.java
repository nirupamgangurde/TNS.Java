package com.company;

public class Break_Continue {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//        }
//        int i = 0;
//        while (i < 5) {
//            System.out.println("loop ends here");
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                System.out.println("Ending the Loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("loop ends here");

        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
