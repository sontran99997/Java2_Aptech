import java.util.ArrayList;
import java.util.List;

public class HocVien {
    private String hoTen;
    private int namSinh;
    private List<Double> dsDiem;
    private List<String> monThiLai;

    public String getHoTen() {
        return hoTen;
    }

    public HocVien(String hoTen, int namSinh, List<Double> dsDiem) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dsDiem = dsDiem;
        this.monThiLai =new ArrayList<>();
    }

    public double diemTrungBinh(){
        double tb = 0;
        for(double diem : dsDiem){
            tb+=diem;
        }
        return tb/5;
    }
    public boolean diemTatCaTren5(){
        for(double a : dsDiem){
            if (a<5)
                return false;
        }
        return true;
    }

    private String dsMonHoc(int n){
        String[] tenMonHoc = {"Toan", "Ly", "Hoa", "Sinh", "Van"};
        return tenMonHoc[n];
    }

    public List<String> getMonThiLai() {
        return monThiLai;
    }

    public void setDsDiem(List<Double> dsDiem) {
        this.dsDiem = dsDiem;
    }

    public List<String> cacMonThiLai(){
        List<String> mtl = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            if(dsDiem.get(i) < 5 ){
                mtl.add(dsMonHoc(i));
            }
        }
        return mtl;
    }
    public boolean lamLuanVan(){
        return diemTrungBinh()>7 && diemTatCaTren5();
    }
    public  boolean thiTotNghiep(){
        return diemTrungBinh()<=7 && diemTatCaTren5();
    }
    public  boolean thiLai(){
        return !diemTatCaTren5();
    }

}
