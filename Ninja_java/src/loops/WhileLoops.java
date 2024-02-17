package loops;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner wl = new Scanner(System.in);
        int n = wl.nextInt(); // Reads an integer input from the user

        int sum = 0;
        int num = 1;
        int i = 0;
        while (i < 5) {
            sum += num;
            num++; // Increment num to sum the next integer
            i++;
        }
        System.out.println("The sum of the first " + n + " positive integers is: " + sum);
    }
}
