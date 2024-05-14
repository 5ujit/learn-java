 import java.io.*;

class Exp {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int[] arr = {1, 2, 3, 4, 5};
            int a1 = arr[4];
            System.out.println(a1);
            String str = null;
            if (str != null) {
                System.out.println(str.length());
            }
            String str1 = "Apple";
            int int1 = 123;
            int var = Integer.parseInt(String.valueOf(int1));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}


