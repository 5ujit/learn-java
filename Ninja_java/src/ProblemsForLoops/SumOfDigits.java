package ProblemsForLoops;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int originalNumber = n; // Store the original number

        while (n > 0) {
            int digit = n % 10;
            sumOfDigits += digit;
            n = n / 10;
        }
        System.out.println("Sum of digits in " + originalNumber + " = " + sumOfDigits);
    }
}
