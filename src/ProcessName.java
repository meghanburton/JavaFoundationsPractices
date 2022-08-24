import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first name:  ");
        String first = console.next();
        System.out.println("Enter your last name: ");
        String last = console.next();

        String name = last + ", " + first.charAt(0) + ".";

        System.out.println("Your name is: " +name);
    }

}
