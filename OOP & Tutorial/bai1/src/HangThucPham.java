import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private int donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    private void setMaHang(String maHang) throws Exception{
        if(!maHang.trim().equals(""))
            this.maHang =maHang;
        else
            throw new Exception("Lỗi: Mã hàng rỗng!");
    }

    private void setTenHang(String tenHang) throws Exception{
        if(!tenHang.trim().equals(""))
            this.tenHang = tenHang;
        else
            throw new Exception("Lỗi: Tên hàng rỗng!");

    }

    public void setDonGia(int donGia) {
        if (donGia>=0)
            this.donGia = donGia;
        else
            this.donGia = 0;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now()))
            this.ngaySanXuat = ngaySanXuat;
        else
            this.ngaySanXuat = LocalDate.now();
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isAfter(this.ngaySanXuat))
            this.ngayHetHan = ngayHetHan;
        else
            this.ngayHetHan = this.ngaySanXuat;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public HangThucPham() {
        this.maHang = "mh00";
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngayHetHan = LocalDate.now();
        this.ngaySanXuat = LocalDate.now();
    }

    public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
    }
    public boolean hetHan(){
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }
    public String dinhDangTien(int donGia){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(donGia);
    }
    public String dinhDangNgay(LocalDate ngay){
        String pt = "dd/MM/yyyy";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pt);
        return dtf.format(ngay);
    }

    @Override
    public String toString() {
        String str;
        if(hetHan())
            str = "Da het han";
        else
            str = "Chua het han";

        return "Ma hang: "+ this.maHang + "\n"+this.tenHang+" "+dinhDangTien(this.donGia)+ "\nNgay San xuat: "+dinhDangNgay(this.ngaySanXuat)+
                "\nNgay Het Han: "+dinhDangNgay(this.ngayHetHan)+"\nMat hang nay "+str;
    }
}
