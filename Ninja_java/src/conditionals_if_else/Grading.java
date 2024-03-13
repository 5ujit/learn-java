package conditionals_if_else;
import java.util.Scanner;
public class Grading {

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);

    System.out.println("Enter your per");
    int per = a.nextInt();
     if(per<=100 && per>=90){
       System.out.println("grade A");
     }
     else if(per<=89 && per >=80 ){
       System.out.println("grade b");
     }


  }
}

// grade per= 100-90 = a
// grade per= 90-80 = b
// grade per= 80- 70 =c
// grade per= 70-60 = d
// grade per= 60- 50 = e
// grade per= 50- 30 = f
// else fail