package Condition;
import java.util.Scanner;
public class Checkisno_divicibl_5 {
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);
        int num= div.nextInt();
        if (num% 5==0){
            System.out.println(num +" is divisible by 5");
        }else {
            System.out.println("not divisible by 5");
        }
    }
}
