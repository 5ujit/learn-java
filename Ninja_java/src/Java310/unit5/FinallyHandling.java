public class FinallyHandling {
  public static void main(String[] args) {
    try
    {
      System.out.println("i am good java devloper ");
      int a = 20, b= 2, c;
      c= a/b;
      System.out.println(c);

    }
    catch(Exception v)

    {
      System.out.println("cannot divide by zero");

    }
    finally{
        System.out.println("dadfa");

    }
    System.out.println("main method ended");

    
  }
  
}
