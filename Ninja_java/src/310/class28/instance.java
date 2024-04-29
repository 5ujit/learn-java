import java.util.Scanner;

class C {
    private int value;

    public C(int value) {
        this.value = value;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject instanceof C) {
            C otherCRef = (C) otherObject;
            return this.value == otherCRef.value;
        }
        return false;
    }
}

class B {
    private int value;

    public B(int value) {
        this.value = value;
    }
}

public class instance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        C a1 = new C(v1);
        C a2 = new C(v2);
        C a3 = new C(v3);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
}
