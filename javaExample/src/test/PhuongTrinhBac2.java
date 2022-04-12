package test;

public class PhuongTrinhBac2 {
    private int a;
    private int b;
    private int c;
    public PhuongTrinhBac2(){

    }
    public PhuongTrinhBac2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int delta(int a, int b, int c){
        return b*b - 4*a*c;
    }
    public float nghiemPhuongTrinh(int a, int b,int c){
        if(b*b - 4*a*c < 0)
            return 0;
        else if (b*b - 4*a*c ==0)
            return (float) (-b)/2*a;
        else
            return (float) ((-b)+ Math.sqrt(b*b - 4*a*c))/2*a;
    }
}
