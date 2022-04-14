package com.example.helloworld.OOP;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private long phoneNumber;
    private int height;

    public Person() {
    }

    public Person(String ten, int tuoi, long soDienThoai, int chieuCao) {
        this.name = ten;
        this.age = tuoi;
        this.phoneNumber = soDienThoai;
        this.height = chieuCao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        if (phoneNumber > 0){
            return phoneNumber;
        }else
            return 0;
    }

    public void setPhoneNumber(long phoneNumber) {
        if(phoneNumber > 0)
            this.phoneNumber = phoneNumber;
        else
            System.out.println("Wrong Phone Number!");
    }

    public int getHeigh() {
        return height;
    }

    public void setHeigh(int heigh) {
        this.height = heigh;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        name = sc.nextLine();
        System.out.println("Nhap Tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap So Dien Thoai: ");
        phoneNumber = sc.nextLong();
        System.out.println("Nhap Chieu Cao: ");
        height = sc.nextInt();
    }
    public void xuatThongTin(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Heigh: "+ height);
    }

    @Override
    public String toString() {
        return "Ten: "+name + '\n' +"Tuoi: "+age + '\n' + "SDT: "+ phoneNumber + '\n' + "Chieu Cao: "+height ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && phoneNumber == person.phoneNumber && height == person.height && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber, height);
    }
}