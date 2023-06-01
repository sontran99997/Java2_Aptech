public class ToaDo {
    private String ten;
    private float x;
    private float y;

    public ToaDo(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public ToaDo() {
    }

    public String getTen() {
        return ten;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return this.ten+"("+this.x+","+this.y+")";
    }
}
