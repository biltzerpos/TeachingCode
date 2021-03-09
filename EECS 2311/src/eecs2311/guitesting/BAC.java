package eecs2311.guitesting;

import javax.swing.*;

public class BAC
{
   public static void main(String[] args)
   {
      BACFrame frame = new BACFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("BAC Application");
      frame.pack();
      frame.setVisible(true);
   }
}
