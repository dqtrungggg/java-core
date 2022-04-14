package com.example.helloworld.Map;

import java.util.HashMap;
import java.util.HashSet;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Customer,String> lst = new HashMap<>();
        HashMap<String,String> lst2 = new HashMap<>();
        Customer customer1  = new Customer("Duong","Trung",12345);
        Customer customer2  = new Customer("Duong","Quang",12345);
//        lst.put(customer1,"Bac Giang");
        lst.put(customer1,"Quang Ninh");
//        lst.put(customer2,"Nghe An");
        lst.put(customer2,"tp HCM");
        for (Customer c: lst.keySet()) {
            System.out.println(c.hienThi() + "\t" + lst.get(c));
//            System.out.println(customer1.getFirstName()+ " "+customer1.getLastName());
            System.out.println(c.getFirstName()+ " " + c.getLastName());


        }
        System.out.println("---------------------------------------------------------------");

        lst2.put("trung","Bac Giang");
        if(lst2.containsKey("trung"))
            System.out.println("tồn tại key");
        lst2.put("trung","Quang Ninh");
        if(lst2.containsKey("trung"))
            System.out.println("tồn tại key");
        lst2.put("trung","Tay Ninh");

        for (String s: lst2.keySet()
        ) {
            System.out.println(s + " - ADDR: "+ lst2.get(s));
        }

        Employee c1 = new Employee();
        c1.setFirstName("Duong");
        c1.setLastName("Trung");
        c1.setPhoneNumber(12355);
        lst.put(c1,"Da nang");

        System.out.println("---------------------------------------------------------------");

    }
}
