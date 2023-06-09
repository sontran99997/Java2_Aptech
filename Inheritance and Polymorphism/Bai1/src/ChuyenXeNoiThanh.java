public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKm;
    public ChuyenXeNoiThanh(){

    }
    public ChuyenXeNoiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKm){
        super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
}
