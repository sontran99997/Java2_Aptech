import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TrungTamDaoTao trungTamDaoTao = new TrungTamDaoTao();

        KhoaHoc kh1 = new KhoaHoc();
        kh1.setNgayMo(LocalDate.of(2023,4,21));
        kh1.setTenKhoaHoc("Lap trinh can ban");
        kh1.setThoiGianHoc("8:00-11:00");

        KhoaHoc kh2 = new KhoaHoc();
        kh2.setNgayMo(LocalDate.of(2023,7,15));
        kh2.setTenKhoaHoc("Lap trinh Java");
        kh2.setThoiGianHoc("14:00-17:00");
        //thêm khóa học vào trung tâm đào tạo
        trungTamDaoTao.themKhoaHoc(kh1);
        trungTamDaoTao.themKhoaHoc(kh2);


        HocVien hv1 = new HocVien("Tran Ngoc Son","HCM","0349427161");
        HocVien hv2 = new HocVien("Nguyen Minh Than","HCM","0344568584");
        HocVien hv3 = new HocVien("Nguyen Van Tien","HCM","0123456789");

        //thêm học viên vào khóa học
        kh1.themHV(hv1);
        kh1.themHV(hv2);
        kh1.themHV(hv3);
        kh2.themHV(hv2);
        kh2.themHV(hv3);

        //tìm khóa học
        System.out.println(trungTamDaoTao.timKhoaHoc("Java"));

        //tìm khóa học của 1 học viên
        System.out.println("Cac khoa hoc cua Hoc Vien "+hv2.getHoTen()+": ");
        for (KhoaHoc kh : trungTamDaoTao.timHVDaHocKH(hv2)){
            System.out.println(kh.getTenKhoaHoc());
        }

        //tìm khóa học chưa kết thúc
        System.out.println("Cac Khoa Hoc chua ket thuc: ");
        for (KhoaHoc kh : trungTamDaoTao.khChuaKetThuc()){
            System.out.println(kh.getTenKhoaHoc());
        }

        //tìm khóa học chưa bắt đầu
        System.out.println("Cac Khoa Hoc chua bat dau: ");
        for (KhoaHoc kh : trungTamDaoTao.khChuaBatDau()){
            System.out.println(kh.getTenKhoaHoc());
        }


    }
}