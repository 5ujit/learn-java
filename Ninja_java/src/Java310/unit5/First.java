// package exception;

public class First {
 public static void main(String []args){
  
  
  try{
	  int [] myNumber ={1,2,3,4};
	   System.out.println(myNumber[10]);
	  
  }catch(Exception e){
	  System.out.println("Array IndexOut Of  Bounds Exception");
  }
 
 }
  
}
