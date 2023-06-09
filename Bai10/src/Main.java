import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProDuct pd1 = new ProDuct("loa","01",500000);
        ProDuct pd2 = new ProDuct("man hinh","02",4500000);
        ProDuct pd3 = new ProDuct("chuot","03",200000);

        Order od = new Order(1, LocalDate.now());
        od.addLineItem(pd1,2);
        od.addLineItem(pd2,1);
        od.addLineItem(pd3,3);
        System.out.println(od.toString());
    }
}