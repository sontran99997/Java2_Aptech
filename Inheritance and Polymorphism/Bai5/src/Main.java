import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        KhachHangVietNam khachHangVietNam1 = new KhachHangVietNam("KVN001","Tran Van A",
                LocalDate.of(2023,6,19),123,2100,DoiTuongKH.Sinh_Hoat);
        KhachHangVietNam khachHangVietNam2 = new KhachHangVietNam("KVN002","Tran Van B",
                LocalDate.of(2018,9,3),450,1800,DoiTuongKH.San_Xuat);
        KhachHangVietNam khachHangVietNam3 = new KhachHangVietNam("KVN003","Tran Van C",
                LocalDate.of(2023,8,17),780,1600,DoiTuongKH.Kinh_Doanh);

        KhachHangNuocNgoai khachHangNuocNgoai1 = new KhachHangNuocNgoai("KNN001","Jonh Wick",
                LocalDate.of(2023,4,23),205,2400,"USA");
        KhachHangNuocNgoai khachHangNuocNgoai2 = new KhachHangNuocNgoai("KNN002","Adam Leo",
                LocalDate.of(2018,9,30),350,2400,"UK");
        KhachHangNuocNgoai khachHangNuocNgoai3 = new KhachHangNuocNgoai("KNN003","Katherin Will",
                LocalDate.of(2023,6,28),287,2400,"FR");


        List<KhachHang> dskh = new ArrayList<>();
        dskh.addAll(Arrays.asList(khachHangVietNam1,khachHangVietNam2,khachHangVietNam3,khachHangNuocNgoai1,khachHangNuocNgoai2,khachHangNuocNgoai3));

        int soKWKHVN = 0;
        int soKWKHNN = 0;
        double thanhTienKHNN = 0;
        int soKHNN = 0;

        for (KhachHang kh : dskh){
            if (kh instanceof KhachHangVietNam){
                soKWKHVN += kh.getKwTieuThu();
            }else {
                soKWKHNN += kh.getKwTieuThu();
                thanhTienKHNN += kh.thanhTien();
                soKHNN++;
            }
        }
        System.out.println("So KW tieu thu cua khach hang Viet Nam: "+soKWKHVN);
        System.out.println("So KW tieu thu cua khach hang Nuoc Ngoai: "+soKWKHNN);

        System.out.println("Trung binh thanh tien cua khach hang Nuoc Ngoai: "+ thanhTienKHNN/soKHNN);

        List<KhachHang> dskhT9_2018= new ArrayList<>();
        for (KhachHang kh : dskh){
            if(kh.getNgayLapHoaDon().isAfter(LocalDate.of(2018,8,31)) && kh.getNgayLapHoaDon().isBefore(LocalDate.of(2018,10,1))){
                dskhT9_2018.add(kh);
            }
        }
        dskhT9_2018.forEach(System.out::println);
    }
}