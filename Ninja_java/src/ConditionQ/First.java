package ConditionQ;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int per= sc.nextInt();
        if(per<=100 && per >=90){
            System.out.println("grade A");
        }
        else if (per<= 89 && per >=80){
            System.out.println("B");
        }
        else if (per<=79 && per>= 70){
            System.out.println("C");
        }

    }




}
