package Condition;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("this no is even "+n);


        }else {
            System.out.println("odd no");
        }
    }
}
