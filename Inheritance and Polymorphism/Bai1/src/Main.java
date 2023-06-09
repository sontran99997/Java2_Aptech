import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<ChuyenXe> dsChuyenXe = new ArrayList<>();
        ChuyenXeNoiThanh cxnt1 = new ChuyenXeNoiThanh(1,"Tran Van A","329-14",450000,30,50.0);
        ChuyenXeNoiThanh cxnt2 = new ChuyenXeNoiThanh(2,"Tran Van B","381-82",350000,150,60.0);

        ChuyenXeNgoaiThanh cnnt1 = new ChuyenXeNgoaiThanh(32,"Tran Van C", "012-34",500000,"Binh Duong",25);
        ChuyenXeNgoaiThanh cnnt2 = new ChuyenXeNgoaiThanh(64,"Tran Van D", "567-89",450000,"Long An",20);

        dsChuyenXe.add(cxnt1);
        dsChuyenXe.add(cxnt2);
        dsChuyenXe.add(cnnt1);
        dsChuyenXe.add(cnnt2);

        double doanhThuNoiThanh = 0.0;
        double doanhThuNgoaiThanh = 0.0;

        for (ChuyenXe cx : dsChuyenXe){
            if (cx instanceof ChuyenXeNoiThanh){
                doanhThuNoiThanh+= cx.getDoanhThu();
            }
        }
        for (ChuyenXe cx : dsChuyenXe){
            if (cx instanceof ChuyenXeNgoaiThanh){
                doanhThuNgoaiThanh+= cx.getDoanhThu();
            }
        }

        System.out.println("Doanh Thu cac Chuyen xe Noi Thanh: "+doanhThuNoiThanh);
        System.out.println("Doanh Thu cac chuyen xe ngoai thanh: "+doanhThuNgoaiThanh);
        System.out.println("Tong doanh thu tat ca cac chuyen xe: "+(doanhThuNoiThanh+doanhThuNgoaiThanh));

    }
}