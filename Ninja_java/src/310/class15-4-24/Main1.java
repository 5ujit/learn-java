import java.util.*;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator; 


/* operation in array list 
  sort
  remove
  reverse
  replace = > 
*/


public class Main1 {

    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("New york");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        
        System.out.println("Element:"+collection);

        // collection.remove("New york");
        collection.set(1,"China");

        for(String s:collection){
          // System.out.println("After remove:"+ s);
          System.out.println("After replace:"+ s);
        }
     }
}
