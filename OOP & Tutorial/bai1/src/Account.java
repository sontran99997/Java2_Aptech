import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public void setAccountNumber(long accountNumber) {
        if (accountNumber>0)
            this.accountNumber = accountNumber;
        else
            this.accountNumber = 999999;
    }

    public void setName(String name) {
        if(name!="")
            this.name = name;
        else
            this.name = "chua xac dinh";
    }

    public void setBalance(double balance) {
        if (balance>=0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public Account() {
        this.accountNumber=999999;
        this.name="chua xac dinh";
        this.balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            return true;
        }else
            return false;
    }
    public boolean withdraw(double amount, double fee){
        if (amount>0 && (amount+fee)<=this.balance){
            this.balance=this.balance-(amount+fee);
            return true;
        }else
            return false;
    }
    public void addInterest(){
        this.balance = this.balance + this.balance*RATE;
    }
    public boolean transfer(Account acc2, double amount){
        if (amount>0){
            this.balance-=amount;
            acc2.balance+=amount;
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "Ten tai khoan: "+this.name +"\nSo tai khoan: "+this.accountNumber+ "\nSo du: "+this.dinhDangtien();
    }
    public String dinhDangtien(){
        Locale local = new Locale("fr","fr");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return formatter.format(this.balance);
    }
}
