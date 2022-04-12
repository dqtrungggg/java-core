package com.example.helloworld;

public class Test {
    public static void main(String args[]) {
        // khai báo và khởi tạo mảng 2 chiều
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
        // in mảng 2 chiều r màn hình
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}