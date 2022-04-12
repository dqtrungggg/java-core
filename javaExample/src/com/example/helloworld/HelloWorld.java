package com.example.helloworld;


import java.util.Scanner;

public class HelloWorld {
    /*Hello World in java*/
    public static void main(String[] args) {
        System.out.println("Hello World");

        /**
         * input
         */

        System.out.println("---------------------");
        String userName = "Duong Quang Trung";
        final int phone = 123456;
        double GPA = 2.9;
        boolean pass = true;
        char grade = 'D';
        long MSV = 1111111111111111111L;

        /**
         * output
         */

        System.out.println("----------------------");
        System.out.println("Ten: "+ userName);
        System.out.println("So Dien Thoai: " + phone);
        System.out.println("Diem GPA: " + GPA);
        System.out.println("Status: "+pass);
        System.out.println("Lop: " + grade);
        System.out.println("Ma Sinh vien: " + MSV);

        /**
         * array
         */

        System.out.println("---------str index----------");
        String[] str = {"a", "b", "c", "d"};
        for (int i = 0; i < str.length; i++){

            System.out.println("String: "+ str[i]);
        }
        /**
         * array index
         */
        System.out.println(str[0]);

        /**
         * boolean
         */

        System.out.println("-----------------------");
        boolean imHandSome = true;
        boolean youHandSome = false;
        System.out.println(imHandSome);
        System.out.println(youHandSome);
        System.out.println("-----------------------");

        /**
         *
         */
        int x, y, z;
        x = 10;
        y = 15;
        z = 20;
        float a =1243;
        System.out.println(x+ y+ z );
        System.out.println(a);

        /**
         * Eg
         */

        int tong;
        tong = 0;
        int[] b = {1,2,3,4,5,6};
        for(int i = 0; i< b.length; i++){
            if (b[i] >= 3){
                tong += b[i];
            }
        }
        System.out.println(tong);

        /**
         * Nhap $ xuat
         */

        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        String tuoi = sc.nextLine();
        System.out.println("Ten vua nhap la: " + ten + "\nTuoi vua nhap la: " + tuoi);


    }
}
