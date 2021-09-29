import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);
        // Get input for x, y, width, and height. Create four separate variables for these.
        int x, y, width, height;

        System.out.println("X: ");
        x = scan.nextInt();
        System.out.println("Y: ");
        y = scan.nextInt();
        System.out.println("Width: ");
        width = scan.nextInt();
        System.out.println("Height: ");
        height = scan.nextInt();
        // Create a Rectangle object using the four pieces of user input.
        Rectangle rectangle = new Rectangle(x, y, width, height);
        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        System.out.println("Perimeter = " + ((rectangle.getWidth() * 2) + (rectangle.getHeight() * 2)));
        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        int newX = (int) (rectangle.getX() - 4);
        int newY = (int) (rectangle.getY() - 2);
        rectangle.setLocation(newX, newY);
        System.out.println("New location is (" + rectangle.getX() + ", " + rectangle.getY() + ")");
    }
}