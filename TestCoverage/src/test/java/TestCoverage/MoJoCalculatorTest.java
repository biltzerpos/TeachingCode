package TestCoverage;

//import TestCoverage.MoJoCalculator;

public class MoJoCalculatorTest extends MoJoTest {

	public void testNoObject(){
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testOneObject(){
		a.println("contain A1 o1");
		b.println("contain B1 o1");
		closeAll();
        assertEquals(0,m.mojo());
        assertEquals(0,m.mojo());
	}

    public void testTwoObjects_1(){
        a.println("contain A1 o1");
        a.println("contain A1 o2");
        b.println("contain B1 o1");
        b.println("contain B2 o2");
        closeAll();
        assertEquals(1,m.mojo());
    }

	public void testTwoObjects_2(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testTwoObjects_3(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testTwoObjects_4(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testThreeObjects_1(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A3 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B3 o3");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testThreeObjects_2(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A3 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_3(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A3 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_4(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A3 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_5(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A3 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(2,m.mojo());
	}

	public void testThreeObjects_6(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B3 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_7(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_8(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testThreeObjects_9(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_10(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_11(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B3 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_12(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testThreeObjects_13(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_14(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_15(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_16(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B3 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_17(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_18(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_19(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testThreeObjects_20(){
		a.println("contain A1 o1");
		a.println("contain A2 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_21(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B3 o3");
		closeAll();
		assertEquals(2,m.mojo());
	}

	public void testThreeObjects_22(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_23(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B2 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_24(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B2 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testThreeObjects_25(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		closeAll();
		assertEquals(0,m.mojo());
	}

	public void testFourObjects_1(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A2 o3");
		a.println("contain A2 o4");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B1 o3");
		b.println("contain B1 o4");
		closeAll();
		assertEquals(1,m.mojo());
	}

	public void testFourObjects_2(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		a.println("contain A1 o4");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		b.println("contain B2 o4");
		closeAll();
		assertEquals(2,m.mojo());
	}

	public void testZhihuaThesis(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		a.println("contain A1 o4");
		a.println("contain A2 o5");
		a.println("contain A2 o6");
		a.println("contain A2 o7");
		a.println("contain A2 o8");
		a.println("contain A3 o9");
		a.println("contain A3 o10");
		a.println("contain A3 o11");
		a.println("contain A3 o12");
		a.println("contain A4 o13");
		a.println("contain A4 o14");
		a.println("contain A4 o15");
		a.println("contain A4 o16");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B4 o3");
		b.println("contain B2 o4");
		b.println("contain B2 o5");
		b.println("contain B2 o6");
		b.println("contain B1 o7");
		b.println("contain B1 o8");
		b.println("contain B3 o9");
		b.println("contain B3 o10");
		b.println("contain B2 o11");
		b.println("contain B2 o12");
		b.println("contain B2 o13");
		b.println("contain B2 o14");
		b.println("contain B3 o15");
		b.println("contain B3 o16");
		closeAll();
		assertEquals(9,m.mojo());
	}

	public void testBilThesis(){
		a.println("contain A1 o1");
		a.println("contain A1 o2");
		a.println("contain A1 o3");
		a.println("contain A1 o4");
		a.println("contain A1 o5");
		a.println("contain A1 o6");
		a.println("contain A2 o7");
		a.println("contain A2 o8");
		a.println("contain A2 o9");
		a.println("contain A3 o10");
		a.println("contain A3 o11");
		a.println("contain A3 o12");
		a.println("contain A3 o13");
		a.println("contain A3 o14");
		a.println("contain A3 o15");
		a.println("contain A3 o16");
		a.println("contain A4 o17");
		a.println("contain A4 o18");
		a.println("contain A4 o19");
		a.println("contain A4 o20");
		a.println("contain A4 o21");
		a.println("contain A4 o22");
		a.println("contain A4 o23");
		a.println("contain A4 o24");
		a.println("contain A4 o25");
		b.println("contain B1 o1");
		b.println("contain B1 o2");
		b.println("contain B2 o3");
		b.println("contain B1 o4");
		b.println("contain B1 o5");
		b.println("contain B2 o6");
		b.println("contain B2 o7");
		b.println("contain B1 o8");
		b.println("contain B1 o9");
		b.println("contain B3 o10");
		b.println("contain B4 o11");
		b.println("contain B4 o12");
		b.println("contain B5 o13");
		b.println("contain B3 o14");
		b.println("contain B4 o15");
		b.println("contain B4 o16");
		b.println("contain B4 o17");
		b.println("contain B4 o18");
		b.println("contain B4 o19");
		b.println("contain B5 o20");
		b.println("contain B1 o21");
		b.println("contain B4 o22");
		b.println("contain B4 o23");
		b.println("contain B4 o24");
		b.println("contain B5 o25");
		closeAll();
		assertEquals(11,m.mojo());
	}
	
	public void testExternal(){
		m = new MoJoCalculator("test1a.rsf", "test1b.rsf", null);
		assertEquals(237,m.mojo());
        m = new MoJoCalculator ("test1b.rsf", "test1a.rsf", null);
		assertEquals(821,m.mojo());
        m = new MoJoCalculator ("test2a.rsf", "test2b.rsf", null);
		assertEquals(320,m.mojo());
        m = new MoJoCalculator ("test2b.rsf", "test2a.rsf", null);
		assertEquals(427,m.mojo());
	}
    
    public void testDistro(){
        m = new MoJoCalculator("distra.rsf", "distrb.rsf", null);
        assertEquals(383,m.mojo());
        m = new MoJoCalculator ("distrb.rsf", "distra.rsf", null);
        assertEquals(357,m.mojo());
    }
    
//    public void testJoshua(){
//        m = new MoJoCalculator("testmojo/joshuaa.rsf", "testmojo/joshuab.rsf", null);
//        assertEquals(383,m.mojo());
//    }

}
