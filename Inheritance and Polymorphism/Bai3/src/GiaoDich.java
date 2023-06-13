import java.time.LocalDate;
import java.util.Objects;

public abstract class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double donGia;
    private int soLuong;
    public double thanhTien(){
        return soLuong*donGia;
    }

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setSoLuong(soLuong);
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        if(Objects.equals(maGiaoDich,"")){
            this.maGiaoDich = "xxx";
        }else {
            this.maGiaoDich = maGiaoDich;
        }
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        if (ngayGiaoDich.isAfter(LocalDate.now())){
            this.ngayGiaoDich = LocalDate.now();
        }else{
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

    public void setSoLuong(int soLuong) {
        if (soLuong < 0){
            this.soLuong = 0;
        }else {
            this.soLuong = soLuong;
        }
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
