package com.example.helloworld;

public class AbstracTest {
    public static void main(String[] args) {
        Shape s = new HinhChuNhat();
        Shape s1 = new HinhTron();
        s.draw();
        s1.draw();
    }
}
