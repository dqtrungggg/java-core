package com.example.helloworld.ThrowAndThrows;

import java.io.File;
import java.io.FileNotFoundException;

public class Throws {
    void m() throws FileNotFoundException {
        File file = new File("C:\\Users\\Trung\\OneDrive\\Máy tính");
        System.out.println("tim thay file text");
//        throw new FileNotFoundException();
    }
    void n(){
        try {
            m();
        }catch (FileNotFoundException ex){
            System.out.println("ko tim thay");
//            ex.printStackTrace();
        }
    }
}
