package eecs2311.guitesting;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

public class BACFrameTest {

    private BACFrame frame;
    
    @BeforeEach
    public void setUp() throws Exception {
        frame = new BACFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BAC Application");
        frame.pack();
        frame.setVisible(true);
    }

    @Test
    public void testClickFemaleButton() throws InterruptedException {
        Thread.sleep(1000);
        frame.female.doClick();
        Thread.sleep(1000);
    }

    @Test
    public void testNameTextField() throws InterruptedException {
        Thread.sleep(1000);
        assertEquals(frame.name.getText(),"");
        frame.name.setText("Bil");
        assertEquals(frame.name.getText(),"Bil");
        Thread.sleep(1000);
    }

}