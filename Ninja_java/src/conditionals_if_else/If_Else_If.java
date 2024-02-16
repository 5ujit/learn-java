package conditionals_if_else;

public class If_Else_If {
    public static void main(String [] args){
        int x= 8;
        int y= 7;
        int z= 9;

        if(x>y && x>z) //false
        {
            System.out.println(x);
            System.out.println("Thanks you");
        }
        else if (y>x && y>z) {
            System.out.println(y);
        }
        else
            System.out.println(z);
    }
}
