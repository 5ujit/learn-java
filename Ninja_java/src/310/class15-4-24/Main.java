// import.java.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator; 

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New york");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        
        Iterator<String> iterator = collection.iterator(); 
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase()); 
            
        }
        System.out.println();
    }
}
