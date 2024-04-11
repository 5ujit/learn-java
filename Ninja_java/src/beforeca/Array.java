//package B4Ca;

class Pen {
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // Corrected the class name to match the declaration
        pen1.color = "blue"; // Accessing instance variables through the instance 'pen1'
        pen1.type = "gel";

        pen1.write(); // Accessing method through the instance 'pen1'
    }
}
