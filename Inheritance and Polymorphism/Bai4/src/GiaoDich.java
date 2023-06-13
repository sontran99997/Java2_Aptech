import java.time.LocalDate;
import java.util.Objects;

public class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setDienTich(dienTich);
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        if (Objects.equals(maGiaoDich,"")){
            this.maGiaoDich = "xxx";
        }
        else {
            this.maGiaoDich = maGiaoDich;
        }
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        if (ngayGiaoDich.isAfter(LocalDate.now())){
            this.ngayGiaoDich = LocalDate.now();
        }else {
            this.ngayGiaoDich = ngayGiaoDich;
        }
    }

    public void setDonGia(double donGia) {
        if (donGia < 0){
            this.donGia = 0;
        }else {
            this.donGia = donGia;
        }
    }

    public void setDienTich(double dienTich) {
        if (dienTich < 0){
            this.dienTich = 0;
        }else {
            this.dienTich = dienTich;
        }
    }
    public double thanhTien(){
        return dienTich*donGia;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }
}
