import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length, width, x, y;
        // create print statements and get input for the x and y values.
        System.out.println("Enter the x coordinate: ");
        x = scan.nextInt();
        System.out.println("Enter the y coordinate: ");
        y = scan.nextInt();

        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point p = new Point(x, y);

        // create print statements and get input for the length and width
        System.out.println("Enter the length: ");
        length = scan.nextInt();
        System.out.println("Enter the width: ");
        width = scan.nextInt();

        //Instantiate a Dimension object d.
        Dimension d = new Dimension(width, length);

        //Instantiate a Rectangle object r.
        Rectangle r = new Rectangle(p, d);

        // Print each object p, d, and r on a separate line.
        System.out.println(p + "\n" + d + "\n" + r);
    }
}