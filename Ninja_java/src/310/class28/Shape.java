abstract class Shape {
    public abstract int getSides();

    public void display() {
        System.out.println("Number of sides: " + getSides());
    }
}

class Triangle extends Shape {
    @Override
    public int getSides() {
        return 3;
    }
}

class Trapezoid extends Shape {
    @Override
    public int getSides() {
        return 4;
    }
}

class Hexagon extends Shape {
    @Override
    public int getSides() {
        return 6;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape trapezoid = new Trapezoid();
        Shape hexagon = new Hexagon();

        triangle.display();
        trapezoid.display();
        hexagon.display();
    }
}
