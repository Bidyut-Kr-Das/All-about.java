class Rectangle {
    private double length;
    private double breadth;

    public void calcArea() {
        System.out.println("The Area is: " + (length * breadth));
    }

    public void calcPeri() {
        System.out.println("The perimeter is: " + (2 * (length + breadth)));
    }

    public Rectangle() {
        System.out.println("Initialised with default value(0)");
    };

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Program31 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        r1.calcArea();
        r1.calcPeri();
        Square s1 = new Square(5);
        s1.calcArea();
        s1.calcPeri();

    }
}
