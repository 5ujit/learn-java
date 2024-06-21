package takeing_input_java;
import java.util.Scanner;
public class Question2 {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter principle");
        float p= sc.nextFloat();


        System.out.println("enter rate of interest");
        float r= sc.nextFloat();
        System.out.println("enter time ");
        float t = sc.nextFloat();

        float si=(p*r*t)/100;

        System.out.println("principle: " +p);
        System.out.println("rate "+ r);
        System.out.println("time "+t);

        System.out.println("simple interest "+si);




    }

}
