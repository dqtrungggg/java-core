package com.example.helloworld;

public class Working extends Person {
    private String doSomeThings;
    private int gioLam;

    public Working() {
    }

    public Working(String ten, int tuoi, long soDienThoai, int chieuCao, String doSomeThings, int gioLam) {
        super(ten, tuoi, soDienThoai, chieuCao);
        this.doSomeThings = doSomeThings;
        this.gioLam = gioLam;
    }

    public String getDoSomeThings() {
        return doSomeThings;
    }

    public void setDoSomeThings(String doSomeThings) {
        this.doSomeThings = doSomeThings;
    }

    public int getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    public void lamViec(){
        System.out.println("Coding.....");
    }
}
