package com.example.helloworld.Enum;

public enum DayV {
    Thuhai(1,"Thu Hai"),
    Thuba(2,"Thu Ba"),
    Thutu(3,"Thu Tu"),
    Thunam(4,"Thu Nam"),
    Thusau(5,"Thu Sau"),
    Thubay(6,"Thu Bay"),
    Chunhat(7,"Chu Nhat");
    private int stt;
    private String description;

    DayV(int stt, String description) {
        this.stt = stt;
        this.description = description;
    }

    public int getStt() {
        return stt;
    }

    public String getDc() {
        return description;
    }

    public void setDc(String dc) {
        this.description = dc;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    String description(){
        return description;
    }
    @Override
    public String toString() {
        return "STT: "+ this.stt + ". Mo Ta: "+ this.description;
    }
}
