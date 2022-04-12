package com.example.helloworld;

public abstract class AbstractClassEg {
    private String hoTenSV;

    public AbstractClassEg() {
    }

    public AbstractClassEg(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }
}