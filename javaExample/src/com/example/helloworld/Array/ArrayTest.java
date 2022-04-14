package com.example.helloworld.Array;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Long.toBinaryString;

public class ArrayTest {
     static void ArrayEg(){
        int arr[][] = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        for(int i =0; i <3; i++){
            for(int j =0 ; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int x = arr[2][1];
        System.out.println(x);

        int[][] a = {{1},{2,3},null};

//        int b =3;
//        b = b << 8;
//        System.out.println(toBinaryString(b));
    }

     static void reverseArr(){
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

     static void Array(){
        int[] arr = new int[10];
        String[] arr1 = new String[]{"b","c","e","a"};
        for(int i =0; i< arr.length; i++){
            arr[i]=i;
        }
        Arrays.sort(arr1);
        for (String p : arr1){
            System.out.print(p);
        }
        System.out.println();
        for (int e : arr) {
            System.out.print(e);
        }
    }
    static void CopyArray(){
        Double[] doubles = { 1.0, 2.0, 3.0 };
        Number[] numbers = Arrays.copyOf(doubles, doubles.length);
        for(Number number : numbers ){
            System.out.print(number+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayEg();
        reverseArr();
        Array();
        CopyArray();
    }
}