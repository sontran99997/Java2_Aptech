import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CDList {
    private int lstsize;
    private List<CD> list;
    public void khoitao(int n){
        list = new ArrayList<>(n);
        this.lstsize = n;
    }
    public void themCD(CD cd){
        int temp = 0;
        for(int i=0; i<list.size();i++){
            if(cd.getMaCD() == list.get(i).getMaCD())
                temp = 1;
        }
        if(this.list.size()>= this.lstsize){
            System.out.println("Danh sach da day!!");
        } else if (temp == 1) {
            System.out.println("Ma CD da ton tai!!");
        }else {
            list.add(cd);
            System.out.println("Them thanh cong!!");
        }
    }
    public int soLuongCD(){
        return list.size();
    }
    public double tongGiaThanhCD(){
        double tong =0;
        for (int i=0; i<list.size();i++){
            tong+=list.get(i).getGiaThanh();
        }
        return tong;
    }
    public void thongTinToanBoCD(){
        for (CD cd : list) {
            System.out.println("Ma CD: " + cd.getMaCD() + "\tTua CD: " + cd.getTuaCD() + "\tSo bai hat: " + cd.getSoBaiHat() + "\tGia thanh: "+cd.getGiaThanh()+"\n");
        }
    }
    public void sapXepGiamDanTheoGiaThanh(){
        list.sort(Comparator.comparingDouble(CD::getGiaThanh).reversed());
    }
    public void saoXepTangDanTheoTuaCD(){
        list.sort(Comparator.comparing(CD::getTuaCD));
    }
}
