import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        //bai1
        ToaDo a = new ToaDo();
        a.setX(5);
        a.setY(5);
        a.setName("Toa do 1");
        System.out.println(a.toString());

        //bai2
        SinhVien a1 = new SinhVien(1,"Son",7.5,8.0);
        SinhVien b = new SinhVien(2,"Quoc",7.5,7.5);
        SinhVien c = new SinhVien(3, "Than", 8.0,9.0);
        System.out.println(a1.diemTB());
        System.out.println(b.diemTB());
        System.out.println(c.diemTB());

        //bai3
        TamGiac tg1 = new TamGiac(-1,2,3);
        TamGiac tg2 = new TamGiac(1,2,3);
        TamGiac tg3 = new TamGiac(3,3,3);
        TamGiac tg4 = new TamGiac(5,5,4);
        TamGiac tg5 = new TamGiac(3,4,5);
        TamGiac[] tgs = {tg1,tg2,tg3,tg4,tg5};
        System.out.println("==============================================================");
        System.out.println("Do dai 3 canh\t\t Kieu tam giac\t\t Chu vi\t\t Dien tich\n");
        for(TamGiac tg : tgs){
            System.out.println(tg.getMa() + "\t\t" + tg.getMb() + "\t\t" + tg.getMc()+"\t\t"+tg.kieuTamGiac()+
                    "\t\t\t"+tg.chuVi()+"\t\t\t"+tg.dienTich());
        }
        System.out.println("==============================================================");


        //bai4
        Vehicle xe1 = new Vehicle("","",3000000,50);
        Vehicle xe2 = new Vehicle("Ngoc Son","Xe Tay Ga",75000000,150);
        Vehicle xe3 = new Vehicle("Minh Than","Xe PKL",150000000,300);
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
        System.out.println("==============================================================");

        //bai5
        HangThucPham htp1 = new HangThucPham("mh001","Xa bong",12000, LocalDate.of(2023,6,1),LocalDate.of(2023,5,1));
        HangThucPham htp2 = new HangThucPham("mh002","May giat",4500000, LocalDate.of(2023,3,4),LocalDate.of(2023,8,1));
        HangThucPham htp3 = new HangThucPham("mh003","Dien thoai",25000000, LocalDate.of(2023,2,1),LocalDate.of(2023,8,1));
        System.out.println(htp1.toString());
        System.out.println(htp2.toString());
        System.out.println(htp3.toString());
        System.out.println("==============================================================");

        //bai6
        Account acc1 = new Account(72354,"Ted Murphy",102.56);
        Account acc2 = new Account(69713,"Jane Smith",40.00);
        Account acc3 = new Account(93757,"Edward Demsey",759.32);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        System.out.println("***************************************************************");
        acc1.deposit(25.85);
        acc2.deposit(500.00);
        acc2.withdraw(430.75,1.50);
        acc3.addInterest();
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        System.out.println("***************************************************************");
        acc2.transfer(acc1,100.00);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("==============================================================");

        //bai7


        }
    }