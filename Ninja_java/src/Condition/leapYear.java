package Condition;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        if((y%400==0)||((y%4==0)&&(y%100 !=0))){
            System.out.println("this year is leap rear " + y);
        }else {
            System.out.println(" not a leap year");
        }
    }
//if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0)))
}
