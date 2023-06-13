import java.time.LocalDate;

public class SachThamKhao extends Sach{
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        return this.getSoLuong()*this.getDonGia()+this.thue;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "thue=" + thue +
                ", maSach=" + super.getMaSach() +
                ", ngayNhap=" + super.getNgayNhap() +
                ", donGia=" + super.getDonGia() +
                ", soLuong=" + super.getSoLuong() +
                ", nhaXuatBan='" + super.getNhaXuatBan() + '\'' +
                '}';
    }
}
