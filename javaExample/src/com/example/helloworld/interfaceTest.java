package com.example.helloworld;

import java.util.Scanner;

public interface interfaceTest {
    void print();
}
interface interfaceTest1 {
    void scan();
}
class  sinhVien implements interfaceTest, interfaceTest1{
    public void print(){
        System.out.println("ABC");
    }
    public void  scan(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }

    public static void main(String[] args) {
        sinhVien sv1 = new sinhVien();
        sv1.print();
        sv1.scan();
    }
}
