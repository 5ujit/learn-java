
import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedList<String> al  = new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    
    System.out.println(al);
    
    // al.add(1,"sooo");
    
    al.addFirst("Zamba");
    
    System.out.println("After the Firstadd"+al);

    al.removeLast();
    System.out.println("After the Lastadd"+al);


  }
}
