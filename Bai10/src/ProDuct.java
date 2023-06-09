public class ProDuct {
    private String description;
    private String productID;
    private double price;

    public String toString(){
        return "ProductID: "+ productID + "\tDescription: "+description+ "\tPrice: "+"\n";
    }

    public ProDuct() {
    }

    public ProDuct(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }
}
