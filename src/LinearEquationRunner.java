import java.util.Scanner;
public class LinearEquationRunner
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("\nEnter coordinate 2: ");
        String coord2 = scan.nextLine();

        int x1 = Integer.parseInt(coord1.substring(coord1.indexOf("(") + 1, coord1.indexOf(", ")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(", ") + 2, coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(coord2.indexOf("(") + 1, coord2.indexOf(", ")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(", ") + 2, coord2.indexOf(")")));

        LinearEquation LE = new LinearEquation(x1, x2, y1, y2);

        System.out.println("");
        System.out.println("The two points are: (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")");
        System.out.println("The equation of the line between these points is: ");
        System.out.println("The slope of this line is " + LE.slope4Print());
        System.out.println("The y-intercept of the line is: " + LE.yIntercept4Print());
    }
}
