package com.example.helloworld.ThrowAndThrows;

public class Throw {
    static void validate(int i){
        try {
            if (i < 16){
                throw new ArithmeticException("NOT valid");
            } else {
                System.out.println("VALID");
            }
        }catch (ArithmeticException err){
            System.out.println(err.getMessage());
        }

//        if(i<15){
//            throw new ArithmeticException("Not valid");
//        } else {
//            System.out.println("DONE");
//        }
    }
}
