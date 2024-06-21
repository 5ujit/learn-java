package takeing_input_java;
import java.util.Scanner;

public class Readchar {
    public static void main(String[] args) {
        System.out.println("enter a character ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("character is "+ch);



    }
}
