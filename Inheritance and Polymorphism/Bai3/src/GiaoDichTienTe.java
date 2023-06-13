import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
    private LoaiTien loaiTien;
    private  double tiGia;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, LoaiTien loaiTien, double tiGia) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public LoaiTien getLoaiTien() {
        return loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setLoaiTien(LoaiTien loaiTien) {
        this.loaiTien = loaiTien;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    public double thanhTien() {
        if (loaiTien == LoaiTien.VND){
            return super.thanhTien();
        }else {
            return super.thanhTien()*tiGia;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "loaiTien=" + loaiTien +
                ", tiGia=" + tiGia +
                "maGiaoDich='" + super.getMaGiaoDich() + '\'' +
                ", ngayGiaoDich=" + super.getNgayGiaoDich() +
                ", donGia=" + super.getDonGia() +
                ", soLuong=" + super.getSoLuong() +
                '}';
    }
}
