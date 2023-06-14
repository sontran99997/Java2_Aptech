import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu(String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
        super(tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        if (nhaSanXuat.equals("")){
            this.nhaSanXuat = "XXX";
        }else {
            this.nhaSanXuat = nhaSanXuat;
        }
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        if (ngayNhapKho.isAfter(LocalDate.now())){
            this.ngayNhapKho = LocalDate.now();
        }else {
            this.ngayNhapKho = ngayNhapKho;
        }
    }

    @Override
    public String toString() {
        return "HangSanhSu{" +
                "maHang= " + super.getMaHang() +
                ", tenHang= '" + super.getTenHang() + '\'' +
                ", donGia= " + super.getDonGia() +
                ", soLuongTon= " + super.getSoLuongTon() +
                "nhaSanXuat='" + nhaSanXuat + '\'' +
                ", ngayNhapKho=" + ngayNhapKho +
                '}';
    }

    @Override
    byte VAT() {
        return 1/10;
    }
}
