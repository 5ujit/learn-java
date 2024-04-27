package Map;
import java.util.*;
public class First1 {
  public static void main(String[] args) {
    Map<String, String> map= new LinkedHashMap<>();
    map.put("123", "amit");
    map.put("111", "k;afdk Shmit");
    map.put("123", "k;Steve Yao" );
    map.put("222", "k;Steve Yao");

    System.out.println(map.get("111"));
    map.clear();

    System.out.println("Size: " + map.size());



    

    }
    
  }
  

