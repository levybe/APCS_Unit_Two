import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.println("Enter a first name.");
        String firstName = scan.nextLine();
        System.out.println("Enter a last name.");
        String lastName = scan.nextLine();
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() + lastName.length());
        System.out.println((firstName.substring(0,1)).toUpperCase() + (lastName.substring(0,1)).toUpperCase());
        System.out.println(firstName.compareTo(lastName));
        System.out.println(lastName.indexOf(firstName.substring(firstName.length() - 1)));



        // Use the required string methods to print out the information


    }
}
