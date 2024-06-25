package Condition;
import java.util.Scanner;
import java.util.Scanner;

public class Check2digitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int no = sc.nextInt();

        if((9<no)&&(no<100)){
            System.out.println("two digit no");

        }else {
            System.out.println("not a two digit no");
        }
    }
}
