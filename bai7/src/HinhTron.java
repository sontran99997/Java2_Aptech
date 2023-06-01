public class HinhTron {
    private ToaDo tam;
    private double banKinh;
    private final double pi = 3.14;

    public ToaDo getTam() {
        return tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh>=0)
            this.banKinh = banKinh;
        else
            this.banKinh = 0;
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }
    public double tinhChuVi(){
        return 2*this.banKinh*pi;
    }
    public double tinhDienTich(){
        return pi*this.banKinh*this.banKinh;
    }

    @Override
    public String toString() {
        return "Hình tròn có tâm "+this.tam.toString()+" với bán kính "+this.banKinh+" có diện tích và chu vi lần lượt là "+
                this.tinhDienTich()+" và "+this.tinhChuVi();
    }
}
