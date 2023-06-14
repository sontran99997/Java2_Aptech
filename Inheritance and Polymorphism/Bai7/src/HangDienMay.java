public class HangDienMay extends HangHoa{
    private double thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String tenHang, double donGia, int soLuongTon, double thoiGianBaoHanh, double congSuat) {
        super(tenHang, donGia, soLuongTon);
        setThoiGianBaoHanh(thoiGianBaoHanh);
        setCongSuat(congSuat);
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        if (thoiGianBaoHanh < 0){
            this.thoiGianBaoHanh = 0;
        }else
        {
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        }
    }

    public void setCongSuat(double congSuat) {
        if (congSuat < 0){
            this.congSuat = 0;
        }else {
            this.congSuat = congSuat;
        }
    }

    @Override
    public String toString() {
        return "HangDienMay{" +
                "maHang= " + super.getMaHang() +
                ", tenHang= '" + super.getTenHang() + '\'' +
                ", donGia= " + super.getDonGia() +
                ", soLuongTon= " + super.getSoLuongTon() +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", congSuat=" + congSuat +
                '}';
    }

    @Override
    byte VAT() {
        return 1/10;
    }
}
