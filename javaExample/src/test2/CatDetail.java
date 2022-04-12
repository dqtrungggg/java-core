package test2;

public class CatDetail implements Cat{
    private String loai;
    private String mau;
    private String noiSong;

    public CatDetail(){

    }
    public CatDetail(String loai, String mau, String noiSong){
        this.loai = loai;
        this.mau = mau;
        this.noiSong = noiSong;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public String getLoai() {
        return loai;
    }

    public String getMau() {
        return mau;
    }

    public String getNoiSong() {
        return noiSong;
    }

    @Override
    public void nhap() {

    }

    @Override
    public void hienThi() {

    }
}
