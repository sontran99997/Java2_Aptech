import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
    private TinhTrang tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, TinhTrang tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public TinhTrang getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrang tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double thanhTien(){
        if (this.tinhTrang == TinhTrang.Moi)
            return this.getSoLuong()*this.getDonGia();
        return this.getSoLuong()*this.getDonGia()*0.5;
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "tinhTrang=" + tinhTrang +
                ", maSach=" + super.getMaSach() +
                ", ngayNhap=" + super.getNgayNhap() +
                ", donGia=" + super.getDonGia() +
                ", soLuong=" + super.getSoLuong() +
                ", nhaXuatBan='" + super.getNhaXuatBan() + '\'' +
                '}';
    }
}
