public class TamGiac {
    private int ma;
    private int mb;
    private int mc;

    public TamGiac() {
    }

    public TamGiac(int ma, int mb, int mc) {
        if(ma+mb>mc && mb+mc>ma && ma+mc>mb){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }else {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }

    }

    public int getMa() {
        return ma;
    }

    public int getMb() {
        return mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMa(int ma) {
        if(ma<0)
            this.ma = ma;
        else
            this.ma = 0;
    }

    public void setMb(int mb) {
        if(mb<0)
            this.mb = mb;
        else
            this.mb = 0;
    }

    public void setMc(int mc) {
        if(mc<0)
            this.mc = mc;
        else
            this.mc = 0;
    }
    public int chuVi(){
        return this.ma+this.mb+this.mc;
    }
    public double dienTich(){
        double dt = 0;
        int p = (this.ma+this.mb+this.mc)/2;
        dt = Math.sqrt(p*(p-this.ma)*(p-this.mb)*(p-this.mc));
        return (double)(Math.floor(dt*100)/100);
//        return dt;
    }

    public String kieuTamGiac(){
        if(this.ma==0 ||this.mb ==0 ||this.mc==0){
            return "Not exist";
        }
        if(this.ma == this.mb && this.mb == this.mc && this.ma!=0){
            return "Deu      ";
        } else if (this.ma == this.mb || this.ma == this.mc || this.mb == this.mc) {
            return "Can      ";
        }else
            return "Thuong   ";
    }
    public String toString(){
        String str = "Do dai 3 canh cua tam giac\n"+this.ma +"\t"+this.mb+"\t"+this.mc;
        String str1 = "\n"+"Kieu tam giac: "+this.kieuTamGiac();
        String str2 = "\n"+"Chu vi: "+this.chuVi();
        String str3 = "\n"+"Dien tich: "+this.dienTich();
        return str+str1+str2+str3;
    }

}
