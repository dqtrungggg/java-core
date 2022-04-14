package com.example.helloworld.Enum;

public class EnumTest {
    private Day thu;
    private String monHoc;

    public EnumTest() {
    }

    public EnumTest(Day thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "Thời Khoá Biếu: " + thu + " ---- Môn Học: " + monHoc + '\n';
    }
}
