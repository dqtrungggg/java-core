package com.example.helloworld.InterFace_AbstractClass;

import com.example.helloworld.InterFace_AbstractClass.InterfaceTest;
import com.example.helloworld.InterFace_AbstractClass.InterfaceTest1;

import java.util.Scanner;

class SinhVien implements InterfaceTest, InterfaceTest1 {
    private String tenSinhVien;
    public SinhVien() {
    }
    public SinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void  scan(){
        Scanner sc = new Scanner(System.in);
        this.tenSinhVien = sc.nextLine();
    }
    public void print(){
        System.out.println("Ten SV: "+ tenSinhVien);
    }

}