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

    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance()
    {
        double $y = y2 - y1;
        double $x = x2 - x1;
        double c = roundedToHundredth(Math.sqrt(Math.pow($x, 2) + Math.pow($y, 2)));
        return c;
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double yIntercept()
    {
        double $y = y2 - y1;
        double $x = x2 - x1;
        double m = $y / $x;
        double b = roundedToHundredth(y1 - (m * x1));
        return b;
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double slope()
    {
        double $y = y2 - y1;
        double $x = x2 - x1;
        double m = $y / $x;
        m = roundedToHundredth(m);
        if (m == -0.0)
        {
            m = 0.0;
        }
        return m;
    }

    /* Returns a String that represents the linear equation of the line through points
   (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5". */
    //BEFORE I CREATE THE EQUATION I WILL CREATE A METHOD TO MEET THE
    //CRITERIA OF WHAT SHOULD BE PRINTED IN THE EQUATION
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
        if (m.equals("1"))
        {
            m = "";
        }
        else if (m.equals("-1"))
        {
            m = "-";
        }
        return m;
    }

//    public String yIntercept4Equation()
//    {
//        double b;
//        double $y = y2 - y1;
//        double $x = x2 - x1;
//        double m = $y / $x;
//        b = y1 - (m * x1);
//        String bStr = "" + roundedToHundredth(b);
//        return bStr;
//    }

    public String equation()
    {
        if (slope() == 0)
        {
            return "The equation of the line between these points is y = " + yIntercept();
        }
        else if (yIntercept() == 0 && slope() == 1)
        {
            return "The equation of the line between these points is y = x";
        }
        else if (yIntercept() == 0)
        {
            return "The equation of the line between these points is y = " + slope4Equation() + "x";
        }
        else if (yIntercept() < 0)
        {
            return "The equation of the line between these points is y = " + slope4Equation() + "x - " + Math.abs(yIntercept());
        }
        return "The equation of the line between these points is y = " + slope4Equation() + "x + " + yIntercept();
    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
   both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue)
    {
//        String coord = "(" + xValue + ", ";
//        coord += (yIntercept() + (xValue * slope())) + ")";
//        String formattedYVal = formatter.format(yVal);
        double xCoord = xValue;
        String formattedXCoord = formatter.format(xCoord);
        double yCoord = yIntercept() + (xValue * slope());
        String formattedYCoord = formatter.format(yCoord);
        String Coord = "The point on the line is (" + formattedXCoord + ".0, " + formattedYCoord + ")";
        return Coord;
    }

    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth
     */
    public double roundedToHundredth(double toRound)
    {
        double thing = toRound;
        String formattedThing = formatter.format(thing);
        double thing2 = Double.parseDouble(formattedThing);
        return thing2;
    }

    /* Returns a string that includes all information about the linear equation, each on
   separate lines:
     - The original points: (x1, y1) and (x2, y2)
     - The equation of the line in y = mx + b format (using equation() method)
     - The slope of the line, as a decimal (using slope() method)
     - The y-intercept of the line (using yIntercept() method)
     - The distance between the two points (using distance() method)

  This method should call all other appropriate methods to get the info it needs:
  equation(), slope(), yIntercept(), distance().

  */
    public String lineInfo()
    {
        return "The two points are: (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")"
                + "\n" + equation()
                + "\nThe slope of this line is: " + slope()
                + "\nThe y-intercept of this line is: " + yIntercept()
                + "\nThe distance between the two points is: " + distance();
    }

    //Welcomes the User
    public String start()
    {
        return "Welcome!";
    }
}

