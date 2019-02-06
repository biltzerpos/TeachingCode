package eecs2311.guitesting;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class BACFrame extends JFrame implements ActionListener
{
   // -----------------------------------------------------------------
   // declare variables and components accessed by more than one method
   // -----------------------------------------------------------------

   final double DEFAULT_BAC_LIMIT = 0.080;  // Ontario BAC limit

   final String[] DRINK_NAMES = { "Beer", "Wine", "Champagne", "Vodka", "Whiskey" };
   final double[] DRINK_SIZES = { 12, 8, 6, 1.25, 1.25 };
   final double[] DRINK_ALCOHOL_RATIOS = { 0.045, 0.11, 0.12, 0.40, 0.43 }; 
   final int NUMBER_OF_DRINKS = DRINK_NAMES.length;
   final int BIGGEST = 2; // index of biggest drink name

   private double bacLimit; 
   private Drink[] onTap = new Drink[NUMBER_OF_DRINKS];

   JTextField name;
   private JRadioButton male;
   JRadioButton female;
   private JTextField weight;
   private JRadioButton kilograms;
   private JRadioButton pounds;
   private JRadioButton defaultBAC;
   private JRadioButton otherBAC;
   private JTextField otherValue;
   private JComboBox hours;
   private JComboBox minutes;
   private JButton submit;
   private JButton changeDrinkSizes;
   private JComboBox[] drinks;
   private JLabel[] drinkLabels;

   // -----------
   // constructor
   // -----------
   
   public BACFrame()
   {
      // --------------------------------------
      // declare and initialize local variables
      // --------------------------------------

      // initialize array of drinks 'on tap'

      for (int i = 0; i < NUMBER_OF_DRINKS; ++i)
      {
         onTap[i] = new Drink(
            DRINK_NAMES[i],
            DRINK_SIZES[i],
            DRINK_ALCOHOL_RATIOS[i]
         );
      }

      // declare some arrays for the combo boxes

      final String[] drinkArray = { "0", "1", "2", "3", "4", "5", "6",
         "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
         "18", "19", "20", "21", "22", "23", "24", "25" };
      final String[] hourArray = { "0", "1", "2", "3", "4", "5", "6",
         "7", "8", "9", "10", "11", "12" };
      final String[] minuteArray = { "0", "5", "10", "15", "20", "25",
         "30", "35", "49", "50", "55" };

      // -------------------------------
      // create and configure components
      // -------------------------------

      name = new JTextField(10);
      name.setMargin(new Insets(0, 3, 0, 0));
      name.setMaximumSize(name.getPreferredSize());

      male = new JRadioButton("Male");
      female = new JRadioButton("Female");

      ButtonGroup genderGroup = new ButtonGroup();
      genderGroup.add(male);
      genderGroup.add(female);
      male.setSelected(true);

      weight = new JTextField();
      weight.setMargin(new Insets(0, 3, 0, 0));

      kilograms = new JRadioButton("Kilograms");
      pounds = new JRadioButton("Pounds");

      ButtonGroup unitGroup = new ButtonGroup();
      unitGroup.add(kilograms);
      unitGroup.add(pounds);
      kilograms.setSelected(true);

      defaultBAC = new JRadioButton("Default (0.080)");
      defaultBAC.setAlignmentX(Component.LEFT_ALIGNMENT);
      otherBAC = new JRadioButton("Other");

      ButtonGroup legalLimitGroup = new ButtonGroup();
      legalLimitGroup.add(defaultBAC);
      legalLimitGroup.add(otherBAC);
      defaultBAC.setSelected(true);

      otherValue = new JTextField(5);
      otherValue.setMaximumSize(otherValue.getPreferredSize());
      otherValue.setMargin(new Insets(0, 3, 0, 0));

      drinks = new JComboBox[DRINK_NAMES.length];
      drinkLabels = new JLabel[DRINK_NAMES.length];

      for (int i = 0; i < NUMBER_OF_DRINKS; ++i)
      {
         drinks[i] = new JComboBox(drinkArray);
         drinks[i].setMaximumSize(drinks[i].getPreferredSize());
         drinkLabels[i] = new JLabel(DRINK_NAMES[i], SwingConstants.RIGHT);
      }

      // make all drink labels the same size

      for (int i = 0; i < NUMBER_OF_DRINKS; ++i)
      {
         drinkLabels[i].setPreferredSize(drinkLabels[BIGGEST].getPreferredSize());
         drinkLabels[i].setMaximumSize(drinkLabels[BIGGEST].getPreferredSize());
      }
      drinkLabels[BIGGEST].setMaximumSize(drinkLabels[BIGGEST].getPreferredSize());

      hours = new JComboBox(hourArray);
      hours.setMaximumSize(hours.getPreferredSize());
      minutes = new JComboBox(minuteArray);
      minutes.setMaximumSize(hours.getPreferredSize());

      changeDrinkSizes = new JButton("Drink sizes");
      changeDrinkSizes.setAlignmentX(Component.CENTER_ALIGNMENT);
      Dimension d = drinks[0].getPreferredSize();
      Dimension d2 = changeDrinkSizes.getPreferredSize();
      changeDrinkSizes.setPreferredSize(new Dimension(d2.width, d.height));
      int maxWidth =
         drinks[BIGGEST].getMaximumSize().width +
         drinkLabels[BIGGEST].getMaximumSize().width + 3;
      changeDrinkSizes.setMaximumSize(new Dimension(maxWidth, d.height));

      submit = new JButton("Submit");

      // -------------
      // add listeners
      // -------------

      submit.addActionListener(this);  // do all the work here
      changeDrinkSizes.addActionListener(this);

      // ------------------
      // arrange components
      // ------------------

      JPanel namePanel = new JPanel();
      namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.Y_AXIS));
      namePanel.add(name);
      namePanel.setBorder(new TitledBorder(new EtchedBorder(), "Name (optional)"));

      JPanel genderPanel = new JPanel();
      genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
      genderPanel.add(male);
      genderPanel.add(female);
      genderPanel.setBorder(new TitledBorder(new EtchedBorder(), "Gender"));

      JPanel weightPanel = new JPanel();
      weightPanel.setLayout(new BoxLayout(weightPanel, BoxLayout.Y_AXIS));
      weightPanel.add(weight);
      weightPanel.add(kilograms);
      weightPanel.add(pounds);
      weightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Weight"));

      d = weightPanel.getPreferredSize();
      d2 = namePanel.getPreferredSize();
      namePanel.setMaximumSize(new Dimension(d2.width, d.height));
      d2 = genderPanel.getPreferredSize();
      genderPanel.setMaximumSize(new Dimension(d2.width, d.height));
      weightPanel.setMaximumSize(d);

      JPanel userPanel = new JPanel();
      userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.X_AXIS));
      userPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      userPanel.add(namePanel);
      userPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      userPanel.add(genderPanel);
      userPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      userPanel.add(weightPanel);
      userPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      userPanel.setBorder(new TitledBorder(new EtchedBorder(), "User Information"));

      JPanel drinksPanel1 = new JPanel();
      drinksPanel1.setLayout(new BoxLayout(drinksPanel1, BoxLayout.Y_AXIS));
      JPanel[] tmp = new JPanel[NUMBER_OF_DRINKS];
      for (int i = 0; i <= NUMBER_OF_DRINKS / 2; ++i)
      {
         tmp[i] = new JPanel();
         tmp[i].setLayout(new BoxLayout(tmp[i], BoxLayout.X_AXIS));
         tmp[i].add(Box.createRigidArea(new Dimension(10, 0)));
         tmp[i].add(drinkLabels[i]);
         tmp[i].add(Box.createRigidArea(new Dimension(3, 0)));
         tmp[i].add(drinks[i]);
         tmp[i].add(Box.createRigidArea(new Dimension(10, 0)));
         drinksPanel1.add(tmp[i]);
         drinksPanel1.add(Box.createRigidArea(new Dimension(0, 6)));
      }

      JPanel drinksPanel2 = new JPanel();
      drinksPanel2.setLayout(new BoxLayout(drinksPanel2, BoxLayout.Y_AXIS));
      for (int i = NUMBER_OF_DRINKS / 2 + 1; i < NUMBER_OF_DRINKS; ++i)
      {
         tmp[i] = new JPanel();
         tmp[i].setLayout(new BoxLayout(tmp[i], BoxLayout.X_AXIS));
         tmp[i].add(Box.createRigidArea(new Dimension(10, 0)));
         tmp[i].add(drinkLabels[i]);
         tmp[i].add(Box.createRigidArea(new Dimension(3, 0)));
         tmp[i].add(drinks[i]);
         tmp[i].add(Box.createRigidArea(new Dimension(10, 0)));
         drinksPanel2.add(tmp[i]);
         drinksPanel2.add(Box.createRigidArea(new Dimension(0, 6)));
      }
      tmp[0] = new JPanel();
      tmp[0].setLayout(new BoxLayout(tmp[0], BoxLayout.X_AXIS));
      tmp[0].add(changeDrinkSizes);
      drinksPanel2.add(tmp[0]);
      drinksPanel2.add(Box.createRigidArea(new Dimension(0, 6)));

      JPanel drinksPanel = new JPanel();
      drinksPanel.setLayout(new BoxLayout(drinksPanel, BoxLayout.X_AXIS));
      drinksPanel.add(drinksPanel1);
      drinksPanel.add(drinksPanel2);
      drinksPanel.setBorder(new TitledBorder(new EtchedBorder(), "Drinks consumed"));
      drinksPanel.setAlignmentY(Component.TOP_ALIGNMENT);

      JPanel timePanel = new JPanel();
      timePanel.setLayout(new BoxLayout(timePanel, BoxLayout.X_AXIS));
      timePanel.add(Box.createRigidArea(new Dimension(10, 0)));
      timePanel.add(hours);
      timePanel.add(new JLabel("Hr"));
      timePanel.add(Box.createRigidArea(new Dimension(10, 0)));
      timePanel.add(minutes);
      timePanel.add(new JLabel("Min"));
      timePanel.add(Box.createRigidArea(new Dimension(10, 0)));
      timePanel.setBorder(new TitledBorder(new EtchedBorder(), "Time since drinking"));
      timePanel.setAlignmentY(Component.TOP_ALIGNMENT);

      JPanel inputPanel = new JPanel();
      inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
      inputPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      inputPanel.add(drinksPanel);
      inputPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      inputPanel.add(timePanel);
      inputPanel.add(Box.createRigidArea(new Dimension(10, 0)));
      inputPanel.setBorder(new TitledBorder(new EtchedBorder(), "Drinking Information"));

      JPanel submitPanel = new JPanel();
      submitPanel.add(submit);
      submitPanel.setBorder(new TitledBorder(new EtchedBorder(),
         "Click below to calculate your Blood Alcohol Concentration"));

      JPanel otherPanel = new JPanel();
      otherPanel.setLayout(new BoxLayout(otherPanel, BoxLayout.X_AXIS));
      otherPanel.add(otherBAC);
      otherPanel.add(otherValue);
      otherPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

      JPanel BACPanel = new JPanel();
      BACPanel.setLayout(new BoxLayout(BACPanel, BoxLayout.Y_AXIS));
      BACPanel.add(defaultBAC);
      BACPanel.add(otherPanel);
      BACPanel.setBorder(new TitledBorder(new EtchedBorder(), "Legal BAC limit"));

      d = userPanel.getMaximumSize();
      d2 = BACPanel.getPreferredSize();
      BACPanel.setMaximumSize(new Dimension(d2.width, d.height));

      JPanel topPanel = new JPanel();
      topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
      topPanel.add(userPanel);
      topPanel.add(BACPanel);

      // set panel sizes

      d = topPanel.getPreferredSize();  // widest panel rules!
      int panelWidth = d.width;
      topPanel.setMaximumSize(new Dimension(panelWidth, d.height));

      d = inputPanel.getPreferredSize();
      inputPanel.setMaximumSize(new Dimension(panelWidth, d.height));
      inputPanel.setPreferredSize(new Dimension(panelWidth, d.height));

      d = submitPanel.getPreferredSize();
      submitPanel.setMaximumSize(new Dimension(panelWidth, d.height));
      submitPanel.setPreferredSize(new Dimension(panelWidth, d.height));

      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.add(topPanel);
      panel.add(Box.createRigidArea(new Dimension(0, 10)));
      panel.add(inputPanel);
      panel.add(Box.createRigidArea(new Dimension(0, 10)));
      panel.add(submitPanel);
      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      // make the panel this extended JFrame's content pane

      this.setContentPane(panel);
   }

   // -------------------------------
   // implement ActionListener method
   // -------------------------------

   public void actionPerformed(ActionEvent ae)
   {
      Object source = ae.getSource();

      if (source == changeDrinkSizes)
      {
         double newSize = 0.0;

         // build an html string containing the current drink sizes

         String current = "";
         for (int i = 0; i < NUMBER_OF_DRINKS; ++i)
            current += "&nbsp;&nbsp;&nbsp;" + onTap[i].getName() +
            " = " + onTap[i].getSize() + " oz<br>";

         String choice = (String)JOptionPane.showInputDialog(
            this,
            "<html><font face=sanserif>" +
            "Current drink sizes:<br>" +
            current + "<br>" +
            "Change size of which drink?",
            "Change Drink Size", JOptionPane.PLAIN_MESSAGE, null,
            DRINK_NAMES, DRINK_NAMES[0]
         );

         if (choice != null)
         {
            String tmp = (String)JOptionPane.showInputDialog(
               this, "Enter the new drink size (oz) for \'" + choice + "\'"
            );
            if (tmp != null)
            {
               try
               {
                  newSize = Double.parseDouble(tmp);
               } catch (NumberFormatException nfe)
               {
                  Toolkit.getDefaultToolkit().beep();
                  JOptionPane.showMessageDialog(this,
                     "Invalid drink size",
                     "Error", JOptionPane.ERROR_MESSAGE);
                  return;             
               }
               Drink.setSize(onTap, choice, newSize);
            }
         }
         return;
      }                           

      // if reached here, must be 'Submit' button

      // determine legal BAC limit

      if (defaultBAC.isSelected())
         bacLimit = DEFAULT_BAC_LIMIT;
      else
      {
         try
         {
            bacLimit = Double.parseDouble(otherValue.getText());
         }
         catch (NumberFormatException nfe)
         {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,
               "Invalid BAC limit",
               "Error", JOptionPane.ERROR_MESSAGE);
            return;             
         }
      }

      // get TBW (total body water volume)

      double tbw;
      if (male.isSelected())
         tbw = 0.58;
      else
         tbw = 0.49;

      // get body weight in kilograms

      double kilos = 0.0;
      try
      {
         kilos = Double.parseDouble(weight.getText());
      }
      catch (NumberFormatException nfe)
      {
         Toolkit.getDefaultToolkit().beep();
         JOptionPane.showMessageDialog(this,
            "Please enter your weight!",
            "Error", JOptionPane.ERROR_MESSAGE);
         return;
      }
      if (pounds.isSelected())
         kilos /= 2.2046; // pounds-to-kilograms conversion factor

      // get time since drinking (hours)

      double t = Integer.parseInt((String)hours.getSelectedItem()) +
                 Integer.parseInt((String)minutes.getSelectedItem()) / 60.0;

      // get total ounces of alcohol

      double alcohol = 0.0;
      for (int i = 0; i < NUMBER_OF_DRINKS; ++i)
         alcohol +=
            Integer.parseInt((String)drinks[i].getSelectedItem()) *
            onTap[i].getAlcoholContent();
            
      // compute BAC (blood alcohol concentration)

      double x = ((alcohol * 23.36 * 0.806 * 100) / (kilos * tbw * 1000));
      double bac = x - (0.012 * t);
      if (bac < 0.0) bac = 0.0;

      // determine if BAC is too high

      boolean tooHigh = bac > bacLimit ? true : false;

      // determine time to wait before driving (used if BAC too high)

      double timeToWait = (x - bacLimit) / 0.012 - t;  

      // build output message (use html codes to format)

      String message = "<html><font face=sanserif>";
      if (name.getText().length() > 0)
         message += name.getText() + ", your ";
      else
         message += "Your ";
      message += "BAC is <font size=+1>" + bac +
         "<font size=-1><br>";
      if (tooHigh)
         message += "<font color=red size=+1>" +
                    "Too much alcohol!<br>" +
                    "Wait " + timeToWait +
                    " hours before driving!";
      else
         message += "OK to drive!";

      // OK, we're done!  Output the message, as appropriate.

      if (tooHigh)
      {
         Toolkit.getDefaultToolkit().beep();
         JOptionPane.showMessageDialog(this, message,
            "Blood Alcohol Concentration",
            JOptionPane.WARNING_MESSAGE);
      }
      else
      {
         JOptionPane.showMessageDialog(this, message,
            "Blood Alcohol Concentration",
             JOptionPane.INFORMATION_MESSAGE);
      }
   }
}
