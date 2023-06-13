import java.time.LocalDate;
import java.util.Arrays;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail[] lineItems;
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems= new OrderDetail[5];
        this.count =0;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    private void check(){
        if(count == lineItems.length){
            int size = lineItems.length + 1;
            lineItems = Arrays.copyOf(lineItems,size);
        }
    }
    public void addLineItem(ProDuct pd, int n){
        check();
        OrderDetail od = new OrderDetail(pd,n);
        lineItems[count] = od;
        count++;

    }
    public double calcTotalCharge(){
        double tong = 0;
        for(OrderDetail od : lineItems){
            tong += od.calcTotalPrice();
        }
        return tong;
    }

    @Override
    public String toString() {
        return "Order{\t" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", lineItems=\n" + Arrays.toString(lineItems) +
                ", \ncount=" + count +
                '}';
    }
}
