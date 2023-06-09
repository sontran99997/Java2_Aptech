import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KhoaHoc {
    private String tenKhoaHoc;
    private LocalDate ngayMo;
    private String thoiGianHoc;
    private List<HocVien> danhSachHocVien;

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public LocalDate getNgayMo() {
        return ngayMo;
    }

    public String getThoiGianHoc() {
        return thoiGianHoc;
    }

    public List<HocVien> getDanhSachHocVien() {
        return danhSachHocVien;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public void setNgayMo(LocalDate ngayMo) {
        this.ngayMo = ngayMo;
    }

    public void setThoiGianHoc(String thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public void setDanhSachHocVien(List<HocVien> danhSachHocVien) {
        this.danhSachHocVien = danhSachHocVien;
    }

    public KhoaHoc() {
        this.danhSachHocVien = new ArrayList<>();
    }

    public KhoaHoc(String tenKhoaHoc, LocalDate ngayMo, String thoiGianHoc, List<HocVien> danhSachHocVien) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.ngayMo = ngayMo;
        this.thoiGianHoc = thoiGianHoc;
        this.danhSachHocVien = danhSachHocVien;
    }

    public void themHV(HocVien hv){
        if(danhSachHocVien.size() < 20){
            danhSachHocVien.add(hv);
            System.out.println("Them thanh cong!!");
        }else
            System.out.println("Danh sach da day!! Khong the them hoc vien");
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "tenKhoaHoc='" + tenKhoaHoc + '\'' +
                ", ngayMo=" + ngayMo +
                ", thoiGianHoc='" + thoiGianHoc + '\'' +
                ", danhSachHocVien=" + danhSachHocVien +
                '}'+"\n";
    }
}
