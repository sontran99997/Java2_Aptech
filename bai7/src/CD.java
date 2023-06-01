public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private float giaThanh;

    public void setMaCD(int maCD) {
        if(maCD>0)
            this.maCD = maCD;
        else
            this.maCD = 999999;
    }

    public void setTuaCD(String tuaCD) {
        if(tuaCD!="")
            this.tuaCD = tuaCD;
        else
            this.tuaCD = "chưa xác định";
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat>0)
            this.soBaiHat = soBaiHat;
        else
            this.soBaiHat = 0;
    }

    public void setGiaThanh(float giaThanh) {
        if (giaThanh > 0)
            this.giaThanh = giaThanh;
        else
            this.giaThanh = 0;
    }

    public int getMaCD() {
        return maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chưa xác định";
        this.soBaiHat = 0;
        this.giaThanh = 0;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "Mã CD: "+this.maCD+"\nTựa CD: "+this.tuaCD+"\nSố bài hát: "+this.soBaiHat+"\nGiá thành: "+this.giaThanh;
    }
}
