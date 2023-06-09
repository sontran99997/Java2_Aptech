public class Student extends Person {

    private float diemMon1;
    private float diemMon2;

    public float diemTB(){
        return (this.diemMon1+this.diemMon2)/2;
    }

    public Student(String ten,String dc, float diemMon1, float diemMon2) {

        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
