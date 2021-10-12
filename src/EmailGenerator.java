import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter your email provider:");
        String emailProvider = scan.nextLine();
        String userName = makeUserName(firstName, lastName);
        String email = makeEmail(userName, emailProvider);
        System.out.println(firstName + " " + lastName + ", your new email is " + email + ".");
    }

    public static String makeUserName(String firstName, String lastName) {
     String userName = (firstName.toLowerCase()).substring(0, 1) + lastName.toLowerCase() + ((int) ((Math.random()*90) + 10));
     return userName;
    }

    public static String makeEmail(String userName, String emailProvider) {
        String email = userName + "@" + emailProvider;
        return email;
    }

}
