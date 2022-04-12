package test;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------BT: Overriding----------");
        TinhTong ttN = new TinhTong();
        ttN.sumAB();

        System.out.println("--------BT: Tinh Chu Vi- dien tich HCN----------");
        Rectangle hinhChuNhat = new Rectangle();
        hinhChuNhat.setChieuDai(2.4);
        hinhChuNhat.setChieuRong(1.4);
        System.out.println(hinhChuNhat.dienTichHnhChuNhat(hinhChuNhat.getChieuDai(), hinhChuNhat.getChieuRong()));
        System.out.println(hinhChuNhat.chuViHinhChuNhat(hinhChuNhat.getChieuDai(), hinhChuNhat.getChieuRong()));

        System.out.println("--------BT: Phuong Trinh bac 2----------");
        PhuongTrinhBac2 pt2 = new PhuongTrinhBac2();
        pt2.setA(6);
        pt2.setB(2);
        pt2.setC(2);
        System.out.println("DELTA: "+pt2.delta(pt2.getA(),pt2.getB(),pt2.getC()));
        System.out.println("Nghiem cua phuong trinh la: "+ pt2.nghiemPhuongTrinh(pt2.getA(), pt2.getB(), pt2.getC()));




        System.out.println("--------BT: Override ----------");
        Bird chim = new Bird();
        Cat meo = new Cat();
        chim.eat();
        chim.fly();
        chim.makeSound();

        meo.eat();
        meo.run();
        meo.makeSound();
    }
}
