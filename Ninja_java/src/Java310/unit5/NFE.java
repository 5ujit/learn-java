/*NumberFormatException*/
public class NFE{
	public static void main(String []args){
		String str ="kdfjak;jf";
		
		try{
			int b=Integer.parseInt(str);
			System.out.println(b);
			
		}catch(NumberFormatException e){
			System.out.println(e);
			
			
		}
		
		
		
		System.out.println("String format expression");
		
		
	}
}