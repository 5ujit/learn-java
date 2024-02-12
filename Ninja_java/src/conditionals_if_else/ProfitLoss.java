package conditionals_if_else;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner pl = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = pl.nextInt();
        System.out.println("Enter the selling price: ");
        int sp = pl.nextInt();

        if (cp < sp) {
            System.out.println("You are in profit.");
            System.out.println("Profit amount: " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("You are in loss.");
            System.out.println("Loss amount: " + (cp - sp));
        } else {
            System.out.println("You neither made a profit nor incurred a loss.");
        }
    }
}
