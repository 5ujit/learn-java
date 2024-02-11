package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a= 15 , b= 10, c = 5;

        // && operators
        System.out.println((a > b ) && (a  > c));// true
        System.out.println((a > b ) && (a  < c));// false


        // or || operators
        System.out.println((c < b )||(a < b ));// true
        System.out.println((a < b )||(a < c ));// false
        System.out.println((a > b)||(b < c)); // true


        // ! operator
        System.out.println(!(a==b));// true
        System.out.println(!(a>b));// false

    }
}
