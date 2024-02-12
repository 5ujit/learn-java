package conditionals_if_else;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner eo = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = eo.nextInt();
        if (n%2 == 0){
            System.out.println("the no is even");
        }
        if(n%2!=0){
            System.out.println("odd");
        }
//        System.out.println(n*n);







    }


}
