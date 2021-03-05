package inheritanceTesting;
import junit.framework.TestCase;

public class TestAccount extends TestCase{
    Account a;
    public void setUp(){
      a = new Account();
    }
    public final void testDeposit(){
      a.deposit(100);
      assertTrue(a.getBalance()==100);
    }
}
