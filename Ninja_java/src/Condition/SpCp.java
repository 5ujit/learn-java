package Condition;
import java.util.Scanner;
public class SpCp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price ");

        int cp = sc.nextInt();

        System.out.println("Enter the selling price ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("you are in profit");
            System.out.println(sp-cp);

        }else{// loss
            System.out.println("you are in loss");
            System.out.println(cp-sp);
        }


    }
}
