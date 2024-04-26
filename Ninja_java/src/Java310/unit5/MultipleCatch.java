public class MultipleCatch {
  public static void main(String []args){
    try {
      int a = 10, b=0, c;
      c= a/b; // This will throw ArithmeticException
      System.out.println(c);
      
      int arr[]= {10,20,50};
      System.out.println(arr[0]); // This is fine

      String str = "ankit";
      System.out.println(str.toUpperCase()); // This will throw NullPointerException

    }
    catch(ArrayIndexOutOfBoundsException a){
      System.out.println("Array Exc");

    }
    catch(ArithmeticException a){
      System.out.println("zero cannot divide any number");

    }
    catch(NumberFormatException f){
      System.out.println("number format exception");

    }
    catch(Exception e){
      System.out.println("All types of exceptions handled");

    }
  }
}
