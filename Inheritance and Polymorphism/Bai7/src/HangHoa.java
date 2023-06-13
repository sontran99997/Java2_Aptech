import java.util.Random;

public class HangHoa {
    private int maHang = new Random().nextInt(100)+1;
    private String tenHang;
    private double donGia;
    private int soLuongTon;


    public HangHoa(String tenHang, double donGia, int soLuongTon) {
        setTenHang(tenHang);
        setDonGia(donGia);
        setSoLuongTon(soLuongTon);
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.equals(""))
            this.tenHang = "XXXX";
        else
            this.tenHang = tenHang;
    }

    public void setDonGia(double donGia) {
        if (donGia<0)
            this.donGia = 0;
        else
            this.donGia = donGia;
    }

    public void setSoLuongTon(int soLuongTon) {
        if (soLuongTon < 0)
            this.soLuongTon = 0;
        else
            this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", soLuongTon=" + soLuongTon +
                '}';
    }

}
