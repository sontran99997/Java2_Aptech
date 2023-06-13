import java.time.LocalDate;
import java.util.Objects;

public class KhachHang {
    private String maKhachHang;
    private String hoTen;
    private LocalDate ngayLapHoaDon;
    private double kwTieuThu;
    private double donGia;
    public double thanhTien(){
        return donGia*kwTieuThu;
    }

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double kwTieuThu, double donGia) {
        setMaKhachHang(maKhachHang);
        setHoTen(hoTen);
        setNgayLapHoaDon(ngayLapHoaDon);
        setKwTieuThu(kwTieuThu);
        setDonGia(donGia);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public double getKwTieuThu() {
        return kwTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setMaKhachHang(String maKhachHang) {
        if (Objects.equals(maKhachHang,"")){
            this.maKhachHang = "XXX";
        }else {
            this.maKhachHang = maKhachHang;
        }
    }

    public void setHoTen(String hoTen) {
        if (Objects.equals(hoTen,"")){
            this.hoTen = "XXX";
        }else {
            this.hoTen = hoTen;
        }
    }

    public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
        if (ngayLapHoaDon.isAfter(LocalDate.now())) {
            this.ngayLapHoaDon = LocalDate.now();
        }else {
            this.ngayLapHoaDon = ngayLapHoaDon;
        }
    }

    public void setKwTieuThu(double kwTieuThu) {
        if (kwTieuThu < 0){
            this.kwTieuThu = 0;
        }else {
            this.kwTieuThu = kwTieuThu;
        }
    }

    public void setDonGia(double donGia) {
        if (donGia<0){
            this.donGia = 0;
        }else {
            this.donGia = donGia;
        }
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayLapHoaDon=" + ngayLapHoaDon +
                ", kwTieuThu=" + kwTieuThu +
                ", donGia=" + donGia +
                '}';
    }
}
