package conditionals_if_else;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        System.out.println("Enter the year ");

        int year= lp.nextInt ();

        if((year %4 == 0 && year % 100 != 0) ||(year % 400== 0) ){
            System.out.println(year + "is a leap year.");

        }
        else{
            System.out.println(year+"not a leap year ");
        }
//        System.out.println(year);
    }
}
