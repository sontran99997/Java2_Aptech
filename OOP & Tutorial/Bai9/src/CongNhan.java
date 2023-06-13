public class CongNhan {
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public int getMaCN() {
        return maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public void setmSoSP(int mSoSP) {
        if(mSoSP<=0){
            System.out.println("So luong khong hop le");
        }else {
            this.mSoSP = mSoSP;
        }

    }

    public CongNhan() {
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }
    public double tinhLuong(){
        double luong;
        if(mSoSP <= 199){
            luong= mSoSP * 0.5;
        } else if (mSoSP <= 399) {
            luong = mSoSP *0.55;
        } else if (mSoSP <= 599) {
            luong = mSoSP * 0.6;
        }else {
            luong = mSoSP * 0.65;
        }
        return luong;
    }
    @Override
    public String toString(){
        return "Ma CN: "+ maCN +"\tHo: "+mHo + "\tTen: "+ mTen +"\tSo SP: "+mSoSP+"\n";
    }
}
