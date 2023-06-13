import java.time.LocalDate;
import java.util.Objects;

public abstract class Sach {
    private String maSach;
    private LocalDate ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach() {
    }

    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        setMaSach(maSach);
        setNgayNhap(ngayNhap);
        setDonGia(donGia);
        setSoLuong(soLuong);
        setNhaXuatBan(nhaXuatBan);
    }

    public String getMaSach() {
        return maSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setMaSach(String maSach) {
        if (Objects.equals(maSach, "")) {
            this.maSach = "xxx";
        }else {
            this.maSach = maSach;
        }
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        if (ngayNhap.isAfter(LocalDate.now()))
        {
            this.ngayNhap = LocalDate.now();
        }else {
            this.ngayNhap = ngayNhap;
        }

    }

    public void setDonGia(double donGia) {
        if (donGia < 0){
            this.donGia = 1;
        }else {
            this.donGia = donGia;
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong < 0 ){
            this.soLuong = 0;
        }else {
            this.soLuong = soLuong;
        }
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        if (Objects.equals(nhaXuatBan,"")){
            this.nhaXuatBan = "xxx";
        }else {
            this.nhaXuatBan = nhaXuatBan;
        }

    }
    public abstract double thanhTien();
}
