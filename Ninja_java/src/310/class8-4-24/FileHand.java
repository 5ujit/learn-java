import java.io.*;
// import java.io 
public class FileHand{
  public static void main(String[]args){
    // String s= "This is my file";
    // int a= 5;
    // double d= 5.45;
    // try{
    //   FileOutputStream fos = new FileOutputStream("abcd.txt");
    //   FileOutputStream dos = new DataOutputStream(fos);
      
    //   dos.writeBytes(s);
    //   dos.writeInt(a);
    //   dos.writeDouble(d);
    //   dos.close();

    // }
    // catch(IOException e){
    //   e.printStackTrace();
    // }
    try{
      FileInputStream fin=  new FileInputStream("1.js");
      DataInputStream din = new DataInputStream (fin );

      String line = null;
      while((line= din.readLine() )!=null){
        System.out.println(line);

      }
      din.close();
      }

      catch(IOException e){
        System.out.println("file not found");
      }

  
  }
}
