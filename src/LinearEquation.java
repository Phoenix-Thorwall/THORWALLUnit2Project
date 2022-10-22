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

    public String yIntercept4Equation()
    {
        double b;
        double $y = y2 - y1;
        double $x = x2 - x1;
        double m = $y / $x;
        b = y1 - (m * x1);
        String bStr = "" + b;
        return bStr;
    }

    public double yIntercept4Print()
    {
        double b;
        double $y = y2 - y1;
        double $x = x2 - x1;
        double m = $y / $x;
        b = y1 - (m * x1);
        return b;
    }

    public String equation()
    {
        return "The equation of the line between these points is y = " + slope4Equation() + "x + " + yIntercept4Equation();
    }

    public String distance()
    {
        double $y = y2 - y1;
        double $x = x2 - x1;
        String c = formatter.format(Math.sqrt(Math.pow($x, 2) + Math.pow($y, 2)));
        return c;
    }


    public String info()
    {
        String equationInfo =
                "The two points are: (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")\nThe equation of the line between these points is: "
                + equation() + "\nThe slope of this line is " + slope4Print()
                +"\nThe y-intercept of the line is " + yIntercept4Print()
                +"\nThe distance between the two points is " + distance();
        return equationInfo;
    }

    public String coordinateForX(double xValue)
    {
        String yVal = "";
        yVal += (yIntercept4Print() + (xValue * slope4Print()));
        String formattedYVal = formatter.format(yVal);
        return formattedYVal;
    }
}
