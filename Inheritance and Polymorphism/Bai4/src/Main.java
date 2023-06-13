import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GiaoDichDat gdd1 = new GiaoDichDat("GDD01", LocalDate.of(2023,1,7),4500000,20000,LoaiDat.A);
        GiaoDichDat gdd2 = new GiaoDichDat("GDD02", LocalDate.of(2013,9,7),45000000,200000,LoaiDat.B);
        GiaoDichDat gdd3 = new GiaoDichDat("GDD03", LocalDate.of(2023,7,15),50000000,250000,LoaiDat.C);

        GiaoDichNha gdn1 = new GiaoDichNha("GDN01",LocalDate.of(2013,9,7),1500000000,150,LoaiNha.Cao_Cap);
        GiaoDichNha gdn2 = new GiaoDichNha("GDN02",LocalDate.of(2023,7,7),500000000,50,LoaiNha.Thuong);
        GiaoDichNha gdn3 = new GiaoDichNha("GDN03",LocalDate.of(2023,6,15),750000000,120,LoaiNha.Cao_Cap);

        List<GiaoDich> dsgd = new ArrayList<>(Arrays.asList(gdd1,gdd2,gdd3,gdn1,gdn2,gdn3));

        int tongGDD = 0;
        int tongGDN = 0;
        double thanhTienGDD = 0;

        for (GiaoDich gd : dsgd){
            if (gd instanceof GiaoDichNha){
                tongGDN++;
            }else {
                tongGDD++;
                thanhTienGDD += gd.thanhTien();
            }
        }
        System.out.println("Tong cac giao dich dat: "+tongGDD);
        System.out.println("Tong cac giao dich nha: "+tongGDN);
        System.out.println("Trung binh thanh tien cua giao dich dat: "+ thanhTienGDD/tongGDD);

        List<GiaoDich> dsgdThang9 = new ArrayList<>();
        for (GiaoDich gd : dsgd){
            if (gd.getNgayGiaoDich().isAfter(LocalDate.of(2013,8,31)) && gd.getNgayGiaoDich().isBefore(LocalDate.of(2013,10,1))){
                dsgdThang9.add(gd);
            }
        }
        System.out.println("Cac giao dich trong thang 9 nam 2013: ");
        dsgdThang9.forEach(System.out::println);
    }
}