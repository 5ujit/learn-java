package Condition;
import  java.util.Scanner;

public class divby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if ((n%5==0)&& (n%3==0)){
            System.out.println("yes this no is divisible by both 3 and 5");
        }else {
            System.out.println("not divisible by 3and 5");
        }

    }
}
