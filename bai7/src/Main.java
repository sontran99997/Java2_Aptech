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
        /*CD cd1 = new CD(12345,"nhac tre",10,102000);
        CD cd2 = new CD(12346,"nhac tru trinh",20,202000);
//        CD[] list = {};
        CDList cdl = new CDList(2);
       *//* cdl.setN(2);
        cdl.setCdList(list);*//*
        cdl.addCD(cd2);
        System.out.println(cdl.getCdList()[0].getMaCD());*/

    }
}