package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int p=10;
        int q;
        // =
        q=p;
        System.out.println(q);

        // +=
        p+= q; // p= p+q//p = 10 +10=20
        System.out.println(p);

        // -=
        p-= q; // p = p-q; //10
        System.out.println(p);

        // *=
        p*=q ;//p = p* q
        System.out.println(p);

        // /=
        p/=q;// p= p/q;
        System.out.println(p);
    }
}
