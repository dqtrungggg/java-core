package com.example.helloworld.OOP;

public class Main {
    public static void main(String[] args) {
        Person myProfile = new Person("trung",12,12346,160);
        Person myProfile1 = new Person("duong",15,123456,200);
        Person myProfile3 = new Person();
        myProfile3.setName("Trung");
        myProfile3.setAge(20);
        myProfile3.setHeigh(220);
        myProfile3.setPhoneNumber(123445678);
        System.out.println(myProfile3);
        System.out.println("__________________________");
        /**
         * equals and hashCode
         */
        System.out.println("So sanh 2 profile: "+ myProfile.equals(myProfile1));
        System.out.println("Hash Code: "+ myProfile.hashCode());
        System.out.println("__________________________");
        /**
         * setter...getter
         */
        myProfile.setName("davcdavdas");
        System.out.println("Ten: "+ myProfile.getName());
        myProfile.setPhoneNumber(-1);
        System.out.println("SDT: "+ myProfile.getPhoneNumber());
        System.out.println("__________________________");
//        myProfile.nhapThongTin();
//        myProfile.xuatThongTin();
        System.out.println("__________________________");
        /**
         * extend...
         */
        Working wk = new Working();
        wk.setGioLam(12);
        System.out.println("Gio Lam: "+ wk.getGioLam());
        wk.lamViec();
        wk.setPhoneNumber(-1);
        System.out.println(wk.getPhoneNumber());
    }
}