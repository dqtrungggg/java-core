package com.example.helloworld.Enum;

public class Test {
    public static void main(String[] args) {
        /**
         * Enum test
         */
        EnumTest thu2 = new EnumTest(Day.Thứ_Hai,"Toan Ly Hoa Sinh Su Dia");
        EnumTest thu3 = new EnumTest(Day.Thứ_Ba,"Toan Ly Hoa Sinh Su Dia");
        EnumTest thu4 = new EnumTest(Day.Thứ_Tư,"Toan Ly Hoa Sinh Su Dia");
        EnumTest thu5 = new EnumTest(Day.Thứ_Năm,"Toan Ly Hoa Sinh Su Dia");
        EnumTest thu6 = new EnumTest(Day.Thứ_Sáu,"Toan Ly Hoa Sinh Su Dia");
        EnumTest thu7 = new EnumTest(Day.Thứ_Bảy,"Toan Ly Hoa Sinh Su Dia");
        EnumTest chuNhat = new EnumTest(Day.Chủ_Nhật,"Toan Ly Hoa Sinh Su Dia");

        System.out.println(thu2);
        System.out.println(thu3);
        System.out.println(thu4);
        System.out.println(thu5);
        System.out.println(thu6);
        System.out.println(thu7);
        System.out.println(chuNhat);
        System.out.println("-------->key+ value--------");

        DayV dayV = DayV.Thuba;
        System.out.println(dayV);

        String x = DayV.Thuhai.description();
        System.out.println(x);
    }
}
