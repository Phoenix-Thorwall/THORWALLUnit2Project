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
        System.out.println(LE.info());
        System.out.print("Enter a value for x: ");
        String xVal = scan.nextLine();
        System.out.println("");
        System.out.print("The point on the line is (" + xVal + LE.coordinateForX(xVal) + ")");


    }
}
