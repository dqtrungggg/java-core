package com.example.helloworld;

import java.util.Scanner;

class  sinhVien implements interfaceTest, interfaceTest1{
    public void print(){
        System.out.println("ABC");
    }
    public void  scan(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }

}