package Condition;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String []arg){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter any integer :");
        int n = sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        System.out.println("the absolute value is :"+n);


    }
}
