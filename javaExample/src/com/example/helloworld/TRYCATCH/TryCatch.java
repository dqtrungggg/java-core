package com.example.helloworld.TRYCATCH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.*;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Trung\\OneDrive\\Máy tính\\text.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            System.out.println(line);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
