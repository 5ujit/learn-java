package conditionals_if_else;
import java.util.Scanner;
public class ProfitLoss{
    public static void main(String[] args) {
        Scanner pl = new Scanner(System.in);
        System.out.println("Enter the price : ");
        int cp = pl.nextInt();
        System.out.println("Enter the selling price ");
        int  sp = pl.nextInt();
        if(cp<sp){
            System.out.println("you are in profit ");
        }
        else{
            System.out.println("you are in loss ");
        }



    }


}
