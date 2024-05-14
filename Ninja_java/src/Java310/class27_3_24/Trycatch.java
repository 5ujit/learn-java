import java.io.*;
public class Trycatch {
    public static void main(String[] args) {
        try {
            int a=[5]={2,3,4,5};
            int b=0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
            System.out.println(e);
//            e.printStackTrace();
//            System.out.println();
        }
    }

}

//outou of bound
//divisibality
//        no format expersion
//
