package javapkg;

public class Ex3bankenca2 {
    //hiding class data
    public double balance= 50;
    public void setBalance(double balance) {
        //validation logic
        this.balance = this.balance + balance;
    }
    public double getBalance() {
        //add validation logic
        return balance ;
    }
}
