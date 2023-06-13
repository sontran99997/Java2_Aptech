import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang{
    private DoiTuongKH doiTuongKH;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double kwTieuThu, double donGia, DoiTuongKH doiTuongKH) {
        super(maKhachHang, hoTen, ngayLapHoaDon, kwTieuThu, donGia);
        this.doiTuongKH = doiTuongKH;
    }

    public DoiTuongKH getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(DoiTuongKH doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    @Override
    public double thanhTien() {
        if(doiTuongKH == DoiTuongKH.Sinh_Hoat){
            if (this.getKwTieuThu()<=100){ //gia su dinh muc sinh hoat la 100kw
                return super.thanhTien();
            }else {
                return this.getDonGia()*100+(this.getKwTieuThu()-100)*this.getDonGia()*2.5;
            }
        } else if (doiTuongKH == DoiTuongKH.Kinh_Doanh) {
            if (this.getKwTieuThu()<=300){ //gia su dinh muc muc kinh doanh la 300kw
                return super.thanhTien();
            }
            else {
                return this.getDonGia()*300+(this.getKwTieuThu()-300)*this.getDonGia()*2.5;
            }
        }else {
            if (this.getKwTieuThu() <= 500){// gia su dinh muc muc san xuat la 500kw
                return super.thanhTien();
            }else {
                return this.getDonGia()*500+(this.getKwTieuThu()-500)*this.getDonGia()*2.5;
            }
        }
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +
                "maKhachHang='" + super.getMaKhachHang() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", ngayLapHoaDon=" + super.getNgayLapHoaDon() +
                ", kwTieuThu=" + super.getKwTieuThu() +
                ", donGia=" + super.getDonGia() +
                "doiTuongKH=" + doiTuongKH +
                '}';
    }
}
