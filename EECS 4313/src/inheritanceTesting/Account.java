package inheritanceTesting;

public class Account {

    protected double balance = 0;
    public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
}
