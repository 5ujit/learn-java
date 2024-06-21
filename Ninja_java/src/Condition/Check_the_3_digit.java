package Condition;
import java.util.Scanner;

public class Check_the_3_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for check ");
        int n = sc.nextInt();
        if ((n>99)&&(n<1000)){
            System.out.println("this is three digit no");

        }else {
            System.out.println("not a 3 digit no ");
        }


        
    }

}
