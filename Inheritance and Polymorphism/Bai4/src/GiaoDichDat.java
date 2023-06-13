import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
    private LoaiDat loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, LoaiDat loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public LoaiDat getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(LoaiDat loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double thanhTien() {
        if (loaiDat == LoaiDat.A){
            return super.thanhTien()*1.5;
        }else {
            return super.thanhTien();
        }
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "maGiaoDich='" + super.getMaGiaoDich() + '\'' +
                ", ngayGiaoDich=" + super.getNgayGiaoDich() +
                ", donGia=" + super.getDonGia() +
                ", dienTich=" + super.getDienTich() +
                "loaiDat=" + loaiDat +
                '}';
    }
}
