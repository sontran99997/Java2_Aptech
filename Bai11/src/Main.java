import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<HocVien> danhSachHocVien = new ArrayList<>();
        danhSachHocVien.add(new HocVien("Tran Van A", 1995,List.of(8.0,7.5,6.5,8.5,8.0)));
        danhSachHocVien.add(new HocVien("Tran Van B", 1996,List.of(4.5,7.5,6.5,4.5,8.0)));
        danhSachHocVien.add(new HocVien("Tran Van C", 1995,List.of(4.0,6.5,6.5,5.5,8.0)));
        danhSachHocVien.add(new HocVien("Tran Van D", 1999,List.of(5.0,5.5,6.5,6.5,6.0)));
        danhSachHocVien.add(new HocVien("Tran Van E", 1999,List.of(5.0,5.5,4.5,4.5,6.0)));

        int soHVLamLuanVan = 0;
        int soHVThiTotNghiep= 0;
        int soHVThiLai=0;
        for(HocVien hv : danhSachHocVien){
            if(hv.lamLuanVan()){
                soHVLamLuanVan++;
            } else if (hv.thiTotNghiep()) {
                soHVThiTotNghiep++;
            } else if (hv.thiLai()) {
                soHVThiLai++;
                hv.getMonThiLai().addAll(hv.cacMonThiLai());
            }
        }
        System.out.println("Số lượng học viên làm luận văn tốt nghiệp: " + soHVLamLuanVan);
        System.out.println("Số lượng học viên thi tốt nghiệp: " + soHVThiTotNghiep);
        System.out.println("Số lượng học viên phải thi lại: " + soHVThiLai);
        System.out.println("Các môn học viên phải thi lại: ");
        for (HocVien hv : danhSachHocVien){
            if (hv.getMonThiLai().size()>0){
                System.out.println(hv.getHoTen()+": "+ hv.getMonThiLai());
            }
        }

    }
}