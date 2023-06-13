import java.time.LocalDate;

public class HangThucPham extends HangHoa{
    private String nhaCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(tenHang, donGia, soLuongTon);
        setNhaCungCap(nhaCungCap);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNhaCungCap(String nhaCungCap) {
        if (nhaCungCap.equals(""))
            this.nhaCungCap = "XX";
        else
            this.nhaCungCap = nhaCungCap;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isAfter(LocalDate.now()))
            this.ngaySanXuat = LocalDate.now();
        else
            this.ngaySanXuat = ngaySanXuat;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isBefore(LocalDate.now()))
            this.ngayHetHan = LocalDate.now();
        else
            this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "HangThucPham{ " +
                "maHang= " + super.getMaHang() +
                ", tenHang= '" + super.getTenHang() + '\'' +
                ", donGia= " + super.getDonGia() +
                ", soLuongTon= " + super.getSoLuongTon() +
                "nhaCungCap= '" + nhaCungCap + '\'' +
                ", ngaySanXuat= " + ngaySanXuat +
                ", ngayHetHan= " + ngayHetHan +
                '}';
    }
}
