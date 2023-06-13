import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double kwTieuThu, double donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayLapHoaDon, kwTieuThu, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return super.thanhTien();
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                "maKhachHang='" + super.getMaKhachHang() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", ngayLapHoaDon=" + super.getNgayLapHoaDon() +
                ", kwTieuThu=" + super.getKwTieuThu() +
                ", donGia=" + super.getDonGia() +
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
