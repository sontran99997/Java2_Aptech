public class SinhVien {
    private int maSV;
    private String name;
    private double diemLT;
    private double diemTH;

    public int getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setMaSV(int maSV) {
        if(this.maSV > 0)
            this.maSV = maSV;
        else
            this.maSV = 10000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiemLT(double diemLT) {
        if(this.diemLT>=0.0 && this.diemLT<=10.0)
            this.diemLT = diemLT;
        else
            this.diemLT = 0.0;
    }

    public void setDiemTH(double diemTH) {
        if(this.diemTH>=0.0 && this.diemTH<=10.0)
            this.diemTH = diemLT;
        else
            this.diemTH = 0.0;
    }
    public SinhVien(){
        this.maSV = 1;
        this.name = "";
        this.diemLT = 0.0;
        this.diemTH = 0.0;

    }
    public SinhVien(int a, String name, double lt, double th){
        this.maSV = a;
        this.name = name;
        this.diemLT = lt;
        this.diemTH = th;
    }
    public double diemTB(){
        return (diemLT + diemTH)/2;
    }
}
