package practiceQ;
import java.util.Scanner;

public class practiceSet {
    public static void main(String []args){
//        qustion = 1;
//        int a= 11;
//        if(a=11){
//
//        }


        // the double == is for equal and single is for assinment op

//        Qustion 2
//        student pass or fail
        byte m1, m2 , m3;
        Scanner mk = new Scanner (System.in);

        System.out.println("Enter your marks in physics");
        m1= mk.nextByte();

        System.out.println("Enter your marks in Mathematics");
        m2= mk.nextByte();


        System.out.println("Enter your marks in chemistry");
        m3= mk.nextByte();


        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33){
            System.out.println();
        }











    }
}
