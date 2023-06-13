import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachCongNhan {
    private List<CongNhan> list;
    private int n;
    public void khoiTao(int n){
        list = new ArrayList<>(n);
        this.n =n;
    }
    public void themCongNhan(CongNhan cn){
        if(list.size() >= n){
            System.out.println("Danh sach da day!!");
        }else {
            list.add(cn);
            System.out.println("Them thanh cong");
        }
    }
    public void xuatThongTinCN(){
        for(CongNhan cn : list){
            System.out.println(cn.toString());
        }
    }
    public int soLuongCN(){
        return list.size();
    }
    public void xuatTTCNTren200SP(){
        for (CongNhan cn : list){
            if(cn.getmSoSP() > 200){
                System.out.println(cn.toString());
            }
        }
    }
    public void sapXepTheoSoSPGiamDan(){
        list.sort(Comparator.comparing(CongNhan::getmSoSP).reversed());
    }
    public void nhapDSCN(int n){
        if (n<=this.n){
            for (int i =0; i<n;i++){
                Scanner scan = new Scanner(System.in);
                System.out.println("Nhap ma Cn thu "+(i+1)+": ");
                int ma = scan.nextInt();
                System.out.println("Nhap Ho CN: ");
                String ho = scan.nextLine();
                System.out.println("Nhap Ten CN: ");
                String ten= scan.nextLine();
                System.out.println("Nhap so SP: ");
                int soSP = scan.nextInt();
                CongNhan cn = new CongNhan(ma,ho,ten,soSP);
                themCongNhan(cn);
            }
        }else System.out.println("So luong khong hop le!!");

    }
}
