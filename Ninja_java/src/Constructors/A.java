package Constructors;

public class A


{
    int a; String name;
    A()
    {
            a=21;
            name = "apple";
    }
    void show()
    {
        System.out.println(a +" "+ name);
    }
}
class B
{
    public static void main(String[] args) {

        A ref = new A();
        ref.show();
    }
}

