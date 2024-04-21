package conditions;

import java.util.Scanner;
public class EvenOdd {

   public static void main(String[] args) {
    Scanner ab = new Scanner(System.in);

    System.out.println("Enter a number for  input");

    int n = ab.nextInt();

    if(n%2==0)
      // (n%2==0)
    {
      System.err.println("is even ");

    }else{
      System.out.println("is odd");
    }
    ab.close();




   }
}