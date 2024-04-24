public class MultipalTryCatch {
  public static void main(String []args){

    try{
      int a=10, b= 5 ,c;
      c=a/b;
      System.out.println(c);

    }
    catch(ArithmeticException a)
    {
      System.out.println("cant divide by zerp");

    }
    try{
      int a[]={10,20,30,2,2};
      System.out.println(a[10]);

    }

    catch(ArrayIndexOutOfBoundsException v)
    {
      System.out.println("beyond  the array limit ");


    }


  }
  
}
