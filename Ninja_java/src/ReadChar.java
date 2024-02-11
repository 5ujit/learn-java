import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        
        System.out.println("enter the character");
        char ch = ab.next().charAt(2);
        System.out.println("Character is "+ ch);

    }
}

