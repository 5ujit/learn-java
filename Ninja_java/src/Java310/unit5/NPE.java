					/*NullpointerException*/
					
					
					// try catch block we are the responsible 
public class NPE{
	public static void main(String []args){
		String str =null; 
		// null is the resrved keyword we can use as value 
		
		System.out.println("hello this is end of the main ");
		
		
		try{
			System.out.println(str.toUpperCase());
			
		}catch(NullPointerException n){
			System.out.println("null cnnot be csted " );
			
		}
		
		
		
		
		System.out.println("hello this is end of the main ");
	}
  
}