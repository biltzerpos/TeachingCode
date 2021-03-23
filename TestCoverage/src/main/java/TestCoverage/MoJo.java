package TestCoverage;

public class MoJo {

    public static void main(String[] args) {
        try
        {
            String run_name = "java mojo.MoJo";
            if (args[args.length-1].equals("-6431")) run_name = "mojo";
            String sourceFile = null, targetFile = null, relFile = null;
            MoJoCalculator mjc;
            if (args.length < 2 || args.length > 5)
            {
                showerrormsg(run_name);
            }
            sourceFile = args[0];
            targetFile = args[1];
            if (args.length > 2)
            {
                /* -m+ indicates single direction MoJoPlus */
                if (args[2].equalsIgnoreCase("-m+"))
                {
                    mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                    System.out.println(mjc.mojoplus());
                }
                else
                /* -b+ indicates double direction MoJoPlus */
                if (args[2].equalsIgnoreCase("-b+"))
                {
                    mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                    long one = mjc.mojoplus();
                    mjc = new MoJoCalculator(targetFile, sourceFile, relFile);
                    long two = mjc.mojoplus();
                    System.out.println(Math.min(one, two));
                }
                else
                /* -b indicates double direction MoJo */
                if (args[2].equalsIgnoreCase("-b"))
                {
                    mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                    long one = mjc.mojo();
                    mjc = new MoJoCalculator(targetFile, sourceFile, relFile);
                    long two = mjc.mojo();
                    System.out.println(Math.min(one, two));
                }
                else
                /* -fm asks for MoJoFM value */
                if (args[2].equalsIgnoreCase("-fm"))
                {
                    mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                    System.out.println(mjc.mojofm());
                }
                else
                // -e indicates EdgeMoJo (requires extra argument)
                if (args[2].equalsIgnoreCase("-e"))
                {
                    if (args.length == 4)
                    {
                        relFile = args[3];
                        mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                        System.out.println(mjc.edgemojo());
                    }
                    else
                    {
                        showerrormsg(run_name);
                    }
                }
                else if (args[2].equals("-6431"))
                {
                    mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                    System.out.println(mjc.mojo());
                }
                else
                {
                    showerrormsg(run_name);
                }
            }
            else
            {
                mjc = new MoJoCalculator(sourceFile, targetFile, relFile);
                System.out.println(mjc.mojo());
            }
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void showerrormsg(String run_name) {
        System.out.println("");
        System.out.println("Please use one of the following:");
        System.out.println("");
        System.out.println(run_name + " a.rsf b.rsf");
        System.out.println("  calculates the one-way MoJo distance from a.rsf to b.rsf");
        System.out.println(run_name + " a.rsf b.rsf -fm");
        System.out.println("  calculates the MoJoFM distance from a.rsf to b.rsf");
        System.out.println(run_name + " a.rsf b.rsf -b");
        System.out.println("  calculates the two-way MoJo distance between a.rsf and b.rsf");
        System.out.println(run_name + " a.rsf b.rsf -e r.rsf");
        System.out.println("  calculates the EdgeMoJo distance between a.rsf and b.rsf");
        System.out.println(run_name + " a.rsf b.rsf -m+");
        System.out.println("  calculates the one-way MoJoPlus distance from a.rsf to b.rsf");
        System.out.println(run_name + " a.rsf b.rsf -b+");
        System.out.println("  calculates the two-way MoJoPlus distance between a.rsf and b.rsf");
        System.exit(0);
    }
}
