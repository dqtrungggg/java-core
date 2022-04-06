package com.example.helloworld;

import java.util.Scanner;

public class DieuKhien_VongLap {
    public static void main(String[] args) throws InterruptedException {
        /**
         * if..else
         */
        int a = 10;
        int b = 15;
        int c = 20;
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)){
            System.out.println("Tam Giac Vuong");
        } else if (a==b && b ==c && c==a){
            System.out.println("Tam giac can");
        } else {
            System.out.println("Tam giac binh thuong");
        }
        System.out.println("-----------------------------------");
        /**
         * Switch
         */
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Thu hai");
                break;
            case 2:
                System.out.println("Thu ba");
                break;
            case 3:
                System.out.println("Thu tu");
                break;
            case 4:
                System.out.println("Thu nam");
                break;
            case 5:
                System.out.println("Thu sau");
                break;
            case 6:
                System.out.println("Thu bay");
                break;
            case 7:
                System.out.println("Chu nhat");
                break;
            default:
                System.out.println("NOPE");
        }
        System.out.println("-----------------------------------");

        /**
         * For loop
         */
        String[] lang = {"java", "R", "Ruby", "python", "C++"};

        for(int i =0; i< lang.length; i++){
            System.out.println(lang[i]);
            Thread.sleep(1000);
        }
        /**
         * While loop
         */
        System.out.println("-----------------------------------");
        int i = 0;
        while (i < 50){
            if (i % 2 ==0){
                System.out.println(i);
            }
            i++;
            Thread.sleep(500);
        }
    }
}
