public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;
    public ChuyenXeNgoaiThanh(){

    }
    public ChuyenXeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc){
        super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}
