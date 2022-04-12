package test;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;

    public Rectangle(){

    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double dienTichHnhChuNhat(double chieuDai, double chieuRong){
        return this.chieuDai*this.chieuRong;
    }

    public double chuViHinhChuNhat(double chieuDai, double chieuRong){
        return this.chieuDai+this.chieuRong;
    }
}
