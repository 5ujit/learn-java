package Condition;
import java.util.Scanner;
public class AreaPerGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");

        int length = sc.nextInt();
        System.out.println("enter the breath");
        int breateh = sc.nextInt();

        int area = length*breateh;
        int pearameter= 2*(length+breateh);
        System.out.println("area :"+area);
        System.out.println("parameter "+ pearameter);

        if (area>pearameter){
            System.out.println("area is greater then the para");

        }else {
            System.out.println("parameter is greater");
        }
    }
}
