import java.util.Scanner;
public class Takinginput {
    public static void main(String[] args) {

        Scanner a =new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = a.next();
//
        System.out.println("Enter your lucky number ");
        int num_1 = a.nextInt();

        System.out.println("My name is"+ name );

        System.out.println("Lucky no is: " + num_1 );

    }

}
