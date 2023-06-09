import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CongNhan cn1 = new CongNhan(123,"Tran","Son",255);
        CongNhan cn2 = new CongNhan(124,"Nguyen","Thanh",155);
        CongNhan cn3 = new CongNhan(125,"Le","Huy",400);
        DanhSachCongNhan dscn1 = new DanhSachCongNhan();
        dscn1.khoiTao(4);
        dscn1.themCongNhan(cn1);
        dscn1.themCongNhan(cn2);
        dscn1.themCongNhan(cn3);
        dscn1.xuatThongTinCN();
        System.out.println("======================================================");
        dscn1.xuatTTCNTren200SP();
        System.out.println("======================================================");
        dscn1.sapXepTheoSoSPGiamDan();
        dscn1.xuatThongTinCN();
        System.out.println("*******************************************************");
        DanhSachCongNhan dscn2 = new DanhSachCongNhan();
        dscn2.khoiTao(3);
//        dscn2.nhapDSCN(3);

    }
}