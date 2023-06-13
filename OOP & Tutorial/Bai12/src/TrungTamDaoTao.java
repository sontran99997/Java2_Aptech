import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrungTamDaoTao {
    private List<KhoaHoc> listKH;

    public List<KhoaHoc> getListKH() {
        return listKH;
    }

    public void setListKH(List<KhoaHoc> listKH) {
        this.listKH = listKH;
    }

    public TrungTamDaoTao() {
        this.listKH = new ArrayList<>();
    }
    public void themKhoaHoc(KhoaHoc kh){
        listKH.add(kh);
    }
    public String timKhoaHoc(String tenKH){
        int a=0;
        for (KhoaHoc k : listKH){
            if(k.getTenKhoaHoc().contains(tenKH)){
                System.out.println("Tim thay Khoa Hoc!!\n");
                a++;
                return k.toString();
            }
        }
        if (a==0){
            System.out.println("Khong tim thay Khoa Hoc!!");
        }
        return "";
    }
    public List<KhoaHoc> timHVDaHocKH(HocVien hv){
        List<KhoaHoc> dsKH = new ArrayList<>();
        for(KhoaHoc kh : listKH){
            for (HocVien hocVien:kh.getDanhSachHocVien()){
                if(hocVien == hv){
                    dsKH.add(kh);
                }
            }
        }
        if(dsKH.size()==0){
            System.out.println("Hoc Vien chua tham gia KHoa Hoc nao!!");
        }
        return dsKH;
    }
    public List<KhoaHoc> khChuaKetThuc(){
        List<KhoaHoc> dsKH = new ArrayList<>();
        for (KhoaHoc kh : listKH){
            //giả sử mỗi khóa học mở trong 3 tháng
            LocalDate ngayKetThuc = kh.getNgayMo().plusMonths(3);
            if (ngayKetThuc.isAfter(LocalDate.now())){
                dsKH.add(kh);
            }
        }
        if(dsKH.size()==0){
            System.out.println("Khong co Khoa Hoc nao chua ket thuc!!");
        }
        return dsKH;
    }
    public List<KhoaHoc> khChuaBatDau(){
        List<KhoaHoc> dsKH = new ArrayList<>();
        for (KhoaHoc kh : listKH){
            if (kh.getNgayMo().isAfter(LocalDate.now())){
                dsKH.add(kh);
            }
        }
        if(dsKH.size()==0){
            System.out.println("Khong co Khoa Hoc nao chua bat dau!!");
        }
        return dsKH;
    }
}
