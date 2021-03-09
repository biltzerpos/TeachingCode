package TestCoverage;

import java.io.IOException;
import java.io.PrintStream;

import junit.framework.TestCase;
//import testCoverage.MoJoCalculator;

public class MoJoTest extends TestCase {

    protected MoJoCalculator m;

    protected PrintStream a, b, r;

    protected void setUp() {
        try
        {
            a = new PrintStream(aName());
            b = new PrintStream(bName());
            r = new PrintStream(rName());
        }
        catch (IOException e)
        {
            System.out.println(e);
            fail();
        }
    }

    protected void closeAll() {
        a.close();
        b.close();
        r.close();
        m = new MoJoCalculator(aName(), bName(), rName());
    }

    protected String aName() {
        return "a.rsf";
    }
    
    protected String bName() {
        return "b.rsf";
    }
    
    protected String rName() {
        return "r.rsf";
    }
    
    public void test1() {
    
    }
}
