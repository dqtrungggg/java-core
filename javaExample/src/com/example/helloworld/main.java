package com.example.helloworld;

public class main {
    public static void main(String[] args) {
        person myProfile = new person("trung",12,12346,160);
        person myProfile1 = new person("duong",15,123456,200);
        person myProfile3 = new person();
        System.out.println(myProfile3);
        System.out.println("__________________________");
        /**
         * equals and hashCode
         */
        System.out.println("So sanh 2 profile"+ myProfile.equals(myProfile1));
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
        working wk = new working();
        wk.setGioLam(12);
        System.out.println("Luong: "+ wk.getGioLam());
        wk.lamViec();
        wk.setPhoneNumber(-1);
        System.out.println(wk.getPhoneNumber());
    }
}