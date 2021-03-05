package inheritanceTesting;

public class TestSavingsAccount extends TestAccount {
    SavingsAccount sa;
    public void setUp(){
      a = new SavingsAccount();
      sa = new SavingsAccount();
    }
    public void testInterest(){
      sa.deposit(100);
      sa.applyInterest(0.01);
      assertEquals(101.0,sa.getBalance());
    }
}
