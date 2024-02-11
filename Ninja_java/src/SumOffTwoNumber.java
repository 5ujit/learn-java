 import java.util.Scanner;
public class SumOffTwoNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number");
        int number1 = a.nextInt();

        System.out.println("Enter the second no ");
        int number2 = a.nextInt();

        int sum = number1 + number2;

        System.out.println("sum is "+ sum);

    }

}
