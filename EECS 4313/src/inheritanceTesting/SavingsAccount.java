package inheritanceTesting;

public class SavingsAccount extends Account {

    public void applyInterest(double d){
        balance *= d+1;
    }
}
