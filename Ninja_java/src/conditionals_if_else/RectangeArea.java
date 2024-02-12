package conditionals_if_else;
import java.util.Scanner;
/* Problem 5 : Check if AREA of rectangle is greater than its PERIMETER */
public class RectangeArea {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Enter the length ");
        int l = re.nextInt();

        System.out.println("Enter the Width ");
        int w = re.nextInt();

        int a = (l*w);
        int  p = 2*(l+w);

        System.out.println(" The perimeter"+" "+ p);
        System.out.println(" The Area:"+" "+ a);
        if(a<p){
            System.out.println("perimeter is greater");
        }
        else{
            System.out.println("area is greater");
        }


    }

}
