public class overloding{
  static void add(int a, int b)
  {
    System.out.println(a+b);
  }
 static void add(int a, float b){
    System.out.println(a+b);
  }
  static void add(float a, float b){
    System.out.println(a+b);
  }
 static void add(float a, double b,double z){
    System.out.println(a+b+c);
  }

public static void main(String[] args){
  int a = Integer.parseInt(args[0]);
  
  int a = Integer.parseInt(args[1]);
  int a = Integer.parseInt(args[2]);
  int a = Integer.parseInt(args[3]);


  add(a,b);
  add(a,b);
  add(a,b);
  add(a,b,c);


}  
}