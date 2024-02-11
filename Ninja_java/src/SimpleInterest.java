import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter principle");
        float p = a.nextFloat();

        System.out.println("Enter the rate annual interest ");
        float r = a.nextFloat();

        System.out.println("Enter the t time ");
        float t = a.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("principle"+ p);
        System.out.println("Rate"+ r);
        System.out.println("time"+ t);

        System.out.println("interest value is :"+ si);



    }

}
