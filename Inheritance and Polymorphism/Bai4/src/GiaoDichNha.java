import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich{
    private LoaiNha loaiNha;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, LoaiNha loaiNha) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
    }

    public LoaiNha getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(LoaiNha loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public double thanhTien() {
        if (loaiNha == LoaiNha.Cao_Cap){
            return super.thanhTien();
        }else {
            return super.thanhTien()*((double) 9 /10);
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "maGiaoDich='" + super.getMaGiaoDich() + '\'' +
                ", ngayGiaoDich=" + super.getNgayGiaoDich() +
                ", donGia=" + super.getDonGia() +
                ", dienTich=" + super.getDienTich() +
                "loaiNha=" + loaiNha +
                '}';
    }
}
