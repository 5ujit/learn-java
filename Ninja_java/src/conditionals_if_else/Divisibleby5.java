package conditionals_if_else;
import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner dv = new Scanner(System.in);
        System.out.println("enter the num");

        int n1 = dv.nextInt();

        if(n1%5==0){
            System.out.println("n1 is divisible by 5");
            System.out.println("good morning ");

        }
        else{
            System.out.println("Not divisible by 5");
            System.out.println("good evening");
        }

    }


}
