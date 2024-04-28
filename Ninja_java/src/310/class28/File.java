//public class File {
//
//class A{
//    public static void main(String[] args) {
//
//    }
//}
//}

class A{
    private int value;
    public A(int value){
        this.value= value;
    }
    public String toString(){
        return "Hello world"+value;
    }
}
public class File {
    public static void main(String[] args) {
        A obj = new A( 10);
        System.out.println((obj.toString()));
        System.out.println("A= "+obj);
    }
}

