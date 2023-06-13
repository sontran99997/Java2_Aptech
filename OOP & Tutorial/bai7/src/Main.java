// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //bai7
        ToaDo td1 = new ToaDo(5,5);
        td1.setTen("O");
        HinhTron ht1 = new HinhTron();
        ht1.setTam(td1);
        ht1.setBanKinh(10.5);
        System.out.println(ht1.toString());

        //bai8
        CD cd1 = new CD(12345,"nhac tre",10,102000);
        CD cd2 = new CD(12346,"nhac tru tinh",20,202000);
        CD cd3 = new CD(12347,"nhac vpop",23,305000);
        CDList cdList = new CDList();
        cdList.khoitao(4);
        cdList.themCD(cd1);
        cdList.themCD(cd2);
        cdList.themCD(cd3);
        cdList.sapXepGiamDanTheoGiaThanh();
        cdList.thongTinToanBoCD();
        cdList.saoXepTangDanTheoTuaCD();
        cdList.thongTinToanBoCD();

    }
}