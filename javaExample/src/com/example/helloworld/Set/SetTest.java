package com.example.helloworld.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> pets = new HashSet<>();
        String[] a = {"dog", "dog" , "cat", "turtle", "lion", "bird"};
        for(String i: a ){
            if (pets.contains(i))
                System.out.println(i);
            pets.add(i);
        }
        System.out.println(pets);
    }
}
