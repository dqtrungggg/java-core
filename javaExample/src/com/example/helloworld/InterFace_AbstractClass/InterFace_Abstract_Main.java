package com.example.helloworld.InterFace_AbstractClass;

//import com.example.helloworld.SinhVien;

public class InterFace_Abstract_Main {
    public static void main(String[] args) {

        /**
         * interface test
         */
        System.out.println("----------------interface--------------");
        SinhVien sv1 = new SinhVien();
        sv1.scan();
        sv1.print();

        /**
         * abstract class test
         */
        System.out.println("-------------abstract class------------");
        AbstractClass sv2 = new AbstractClass();
        AbstractClassEg sv = new AbstractClass();

        sv2.setHoTenSV("Nguyen van A");
        System.out.println("Ho Ten SV: "+ sv2.getHoTenSV());

        sv.setHoTenSV("william shakespeare");
        System.out.println("Ho Ten SV: "+ sv.getHoTenSV());
    }
}