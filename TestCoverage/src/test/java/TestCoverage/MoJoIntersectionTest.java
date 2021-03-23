package TestCoverage;

public class MoJoIntersectionTest extends MoJoTest {

    public void testTwoObjects_1(){
        a.println("contain A1 o1");
        a.println("contain A2 o2");
        b.println("contain B1 o1");
        b.println("contain B2 o3");
        closeAll();
        assertEquals(0,m.mojo());
    }

}
