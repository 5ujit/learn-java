package takeing_input_java;
import java.util.Scanner;
public class SumOf2Num {
    public static void main(String []arg){
        Scanner sum = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int a = sum.nextInt();
        System.out.println("Enter 2st number ");
        int b= sum.nextInt();
        int c= a+b;
        System.out.println("sum of a and b is :"+c);
    }
}
