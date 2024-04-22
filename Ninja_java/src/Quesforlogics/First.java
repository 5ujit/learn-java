// check the integer is even or odd ??
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner oddEv = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = oddEv.nextInt();

        System.out.println("You entered: " + num);

        // Close the Scanner to release resources
        oddEv.close();
    }
}
