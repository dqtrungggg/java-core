package com.example.helloworld.ThrowAndThrows;

public class TestThrows {
     static void chia2So(int a, int b) throws CustomException {
        try {
            int result = a/b;
            System.out.println(result);
        } catch (Exception exception){
            System.out.println("Khong chia duoc cho 0");
        }

    }
    public static void main(String[] args) throws CustomException {
        Throws trs = new Throws();
        trs.n();
        System.out.println("-----------------------------");
        try{
            chia2So(2,1);
        }catch (CustomException customException){
            System.out.println(customException.getError());
        }
    }
}
