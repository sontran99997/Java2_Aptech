import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK001", LocalDate.of(2023,1,7),45000,25,"NXBTre",TinhTrang.Moi);
        SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK002", LocalDate.of(2023,7,7),35000,40,"NXBNhiDong",TinhTrang.Moi);
        SachGiaoKhoa sgk3 = new SachGiaoKhoa("SGK003", LocalDate.of(2023,6,15),95000,10,"NXBTre",TinhTrang.Cu);

        SachThamKhao stk1 = new SachThamKhao("STK001",LocalDate.of(2023,1,7),115000,10,"NXBTaoLao",15000);
        SachThamKhao stk2 = new SachThamKhao("STK002",LocalDate.of(2023,7,7),120000,20,"NXBTaoLao",15000);
        SachThamKhao stk3 = new SachThamKhao("STK003",LocalDate.of(2023,6,15),95000,30,"NXBTaoLao",15000);

        List<Sach> dsSach = new ArrayList<>();
        dsSach.addAll(Arrays.asList(sgk1,sgk2,sgk3,stk1,stk2,stk3));

        double tongTienSGK = 0;
        double tongTienSTK = 0;
        double donGia = 0;
        int soSTK = 0;

        for (Sach s : dsSach){
            if (s instanceof SachGiaoKhoa){
                tongTienSGK += s.thanhTien();
            }else {
                tongTienSTK += s.thanhTien();
                donGia += s.getDonGia();
                soSTK++;
            }
        }
        System.out.println("Tong tien sach giao khoa: "+tongTienSGK);
        System.out.println("Tong tien sach tham khao: "+tongTienSTK);
        System.out.println("Trung binh cong don gia sach tham khao: "+donGia/soSTK);

        List<Sach> dsSachNXB = new ArrayList<>();
        for (Sach sc : dsSach){
            if (sc instanceof SachGiaoKhoa){
                if (Objects.equals(sc.getNhaXuatBan(), "NXBTre")){
                    dsSachNXB.add(sc);
                }
            }
        }
        dsSachNXB.forEach(System.out::println);
    }
}