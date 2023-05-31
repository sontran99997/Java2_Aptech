public class Vehicle {
    private String owner;
    private String type;
    private int value;
    private int capacity;

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setOwner(String owner) {
        if(owner != "")
            this.owner = owner;
        else
            this.owner = "None";
    }

    public void setType(String type) {
        if (type != "")
            this.type = type;
        else
            this.type = "None";
    }

    public void setValue(int value) {
        if(value >= 0)
            this.value = value;
        else
            this.value = 0;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0)
            this.capacity = capacity;
        else
            this.capacity = 0;
    }

    public Vehicle() {
    }

    public Vehicle(String owner, String type, int value, int capacity) {
        this.setOwner(owner);
        this.setType(type);
        this.setValue(value);
        this.setCapacity(capacity);
    }
    public float tax(){
        if (this.capacity < 100){
            return (float) this.value/100;
        }else if (this.capacity <= 200){
            return (float) (this.value/100)*3;
        }else
            return (float) (this.value/100)*5;
    }
    public String toString(){

        return this.owner + "\t" + this.type + "\t" + this.value + "\t" + this.capacity + "cc " + "Thue: " + this.tax()+"đ";
    }
}
