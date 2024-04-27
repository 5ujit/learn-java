/* create one list form of kay and value pairimplment using tree map 
and display the list (key is the para value is the para type in integer  )

 */


/* 
package Map;
import java.util.Map;
import java.util.TreeMap;
// import java.util.treeMap;
public class Question {
  public static void main(String[] args) {
    Map<String,String> m= new TreeMap<String, String>();
    m.put("A", "1");
    m.put("C", "3");
    m.put("D", "4");
    m.put("E", "8");
    System.out.println(m);
    m.remove("E");

    for(String k:m.keySet() ){
      System.out.println("key"+ k+ "value"+m.get(k));
    }

    
    
  }

  
}
*/


package Map;
import java.util.Map;
import java.util.TreeMap;

public class Question {
  public static void main(String[] args) {
    Map<String, String> m = new TreeMap<String, String>();
    m.put("A", "1");
    m.put("C", "3");
    m.put("D", "4");
    m.put("E", "8");
    System.out.println(m);

    // Corrected removal of entry with key "E"
    m.remove("E");

    // Printing the map after removal
    for(String k : m.keySet()) {
      System.out.println("key: " + k + ", value: " + m.get(k));
    }
  }
}
