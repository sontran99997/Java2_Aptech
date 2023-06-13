import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GiaoDichVang gdv1 = new GiaoDichVang("V01", LocalDate.of(2023,1,7),2500000,10,"9999");
        GiaoDichVang gdv2 = new GiaoDichVang("V02", LocalDate.of(2023,12,7),3500000,15,"9999");
        GiaoDichVang gdv3 = new GiaoDichVang("V03", LocalDate.of(2023,6,7),1500000,20,"9999");

        GiaoDichTienTe gdtt1 = new GiaoDichTienTe("TT01",LocalDate.of(2023,1,7),7500000,10,LoaiTien.VND,1);
        GiaoDichTienTe gdtt2 = new GiaoDichTienTe("TT02",LocalDate.of(2023,7,7),8000000,10,LoaiTien.USD,2.3);
        GiaoDichTienTe gdtt3 = new GiaoDichTienTe("TT03",LocalDate.of(2023,6,15),1500000000,10,LoaiTien.EURO,2.6);

        List<GiaoDich> dsgd = new ArrayList<>(Arrays.asList(gdv1, gdv2, gdv3, gdtt1, gdtt2, gdtt3));

        int soLuongGDV = 0;
        int soLuongGDTT = 0;
        double thanhTienGDTT = 0;
        int soGDTT= 0;

        for (GiaoDich gd : dsgd){
            if (gd instanceof GiaoDichVang){
                soLuongGDV += gd.getSoLuong();
            }else {
                soLuongGDTT += gd.getSoLuong();
                thanhTienGDTT += gd.thanhTien();
                soGDTT++;
            }
        }

        System.out.println("Tong so luong GD Vang: "+ soLuongGDV);
        System.out.println("Tong so luong GD Tien Te: "+ soLuongGDTT);
        System.out.println("Trung binh thanh tien cua GD Tien Te: "+ thanhTienGDTT/soGDTT);

        List<GiaoDich> dsGDHon1Ty = new ArrayList<>();
        for (GiaoDich gd : dsgd){
            if (gd instanceof  GiaoDichTienTe){
                if (gd.getDonGia()>1000000000){
                    dsGDHon1Ty.add(gd);
                }
            }
        }
        dsGDHon1Ty.forEach(System.out::println);
    }
}