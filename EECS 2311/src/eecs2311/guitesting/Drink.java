package eecs2311.guitesting;
class Drink
{
   private String name;
   private double size;
   private double alcoholRatio;

   Drink (String name, double size, double alcoholRatio)
   {
      this.name = name;
      this.size = size;
      this.alcoholRatio = alcoholRatio;
   }

   public void setSize(double d) { size = d; }
   public void setAlcoholRatio(double d) { alcoholRatio = d; }
   public String getName() { return name; }
   public double getSize() { return size; }
   public double getAlcoholRatio() { return alcoholRatio; }
   public double getAlcoholContent() { return size * alcoholRatio; }

   public static void setSize(Drink[] d, String name, double size)
   {
      for (int i = 0; i < d.length; ++i)
      {
         if (d[i].getName().equals(name))
         {
            d[i].setSize(size);
            break;
         }
      }
   }
}
