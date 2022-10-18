import java.text.DecimalFormat;
public class LinearEquation
{
    //Decimal Formatter!
    DecimalFormat formatter = new DecimalFormat("#.##");

    //Initializing Variables
    int x1;
    int x2;
    int y1;
    int y2;

    //Creating the Object for y=mx+b
    public LinearEquation(int x1, int x2, int y1, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public String slope4Equation()
    {
        int $y = y2 - y1;
        int $x = x2 - x1;
        String m = "";
        if ($y % $x != 0)
        {
            m = $y + "/" + $x;
            if ($y < 0 && $x < 0)
            {
                m = Math.abs($y) + "/" + Math.abs($x);
            }
            else if ($y > 0 && $x < 0)
            {
                m = $y * -1 + "/" + Math.abs($x);
            }
            return m;
        }
        m += $y / $x;
        return m;
    }

    public double slope4Print()
    {
        double $y = y2 - y1;
        double $x = x2 - x1;
        double m = $y / $x;
        String formattedM = formatter.format(m);
        double true4MattedM = Double.parseDouble(formattedM);
        return true4MattedM;
    }

    public String yIntercept()
    {
        return "";
    }

    public String equation()
    {
        return "";
    }



}
