public class OrderDetail {
    private int quatity;
    private ProDuct product;

    public OrderDetail(ProDuct product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
    public double calcTotalPrice(){
        return quatity* product.getPrice();
    }
    public String toString(){
        return "ProductID: "+product.getProductID()+"\tQuatity: "+quatity+"\tTotalPrice: "+calcTotalPrice()+"\n";
    }
}
