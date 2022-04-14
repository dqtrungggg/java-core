package com.example.helloworld.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    static void ArrayLst() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        for (int i : arrayList) {
            System.out.print(i + " ");      //index = get(i)
        }
    }
    static void IteratorLst(){
        List<String> list = new ArrayList<>();
        list.add("moi");
        list.add("nguoi");
        list.add("trong");
        list.add("mot");
        list.add("quoc");
        list.add("gia");
        list.add("deu");
        list.add("co");
        list.add("quyen");
        list.add("binh");
        list.add("dang");
        Iterator<String> iteratorLst = list.listIterator();
        System.out.println(list.size()+"\n");
        while (iteratorLst.hasNext()){          //hashPrevious
            System.out.print(iteratorLst.next()+ " ");      //previous
        }
    }
    static void ArrayToList(){
        String[] t = {"t","r"};
        System.out.println("\n"+ Arrays.asList(t));
//        ArrayList<Double> arrLstDouble = new ArrayList<>();
//        arrLstDouble.add(1.2);
//        arrLstDouble.add(5.3);
//        arrLstDouble.add(2.8);
//        arrLstDouble.add(4.6);
//        arrLstDouble.add(9.7);
//        System.out.println(arrLstDouble);
    }
    public static void main(String[] args) {
        ArrayLst();
        IteratorLst();
        ArrayToList();
    }
}
