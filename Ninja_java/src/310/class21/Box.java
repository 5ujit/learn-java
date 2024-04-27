class Box {
    double height, width, depth;

    Box() {
        height = -1;
        width = -1;
        depth = -1;
    }

    Box(double len) {
        height = len;
        width = len;
        depth = len;
    }

    Box(double a, double b, double c) {
        height = a;
        width = b;
        depth = c;
    }

    double volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            Box b = new Box();
            System.out.println("Volume is : " + b.volume());
        }
        if (args.length == 1) {
            double d1 = Double.parseDouble(args[0]);
            Box b1 = new Box(d1);
            System.out.println("Volume is : " + b1.volume());
        } else if (args.length == 3) {
            double d2 = Double.parseDouble(args[0]);
            double d3 = Double.parseDouble(args[1]);
            double d4 = Double.parseDouble(args[2]);
            Box b2 = new Box(d2, d3, d4);
            System.out.println("Volume is : " + b2.volume());
        }
    }
}
