import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.println("First name:");
        String firstName = scan.nextLine();
        System.out.println("Last name:");
        String lastName = scan.nextLine();
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() + lastName.length());
        System.out.println((firstName.substring(0,1)).toUpperCase() + (lastName.substring(0,1)).toUpperCase());
        System.out.println(firstName.compareTo(lastName));
        System.out.println(lastName.indexOf(firstName.substring(firstName.length() - 1)));
        System.out.println(firstName.indexOf(lastName.substring(lastName.length() - 1)));
        String halfFirst1 = firstName.substring(0, (firstName.length()/2));
        String halfFirst2 = firstName.substring((firstName.length()/ 2), firstName.length());
        String halfLast1 = lastName.substring(0, (lastName.length()/2));
        String halfLast2 = lastName.substring((lastName.length()/ 2), lastName.length());
        /* A new first and last name made of the following */ System.out.println(halfFirst1 + halfLast2 + " " + halfLast1 + halfFirst2);


        // Use the required string methods to print out the information


    }
}
