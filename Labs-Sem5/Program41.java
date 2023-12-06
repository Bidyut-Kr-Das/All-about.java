interface Shape {
    public final double pi = 3.14;

    public void input();

    public void calcArea();
}

class Circle implements Shape {
    private int r = 0;
    private double area = 0;

    @Override
    public void input() {
        r = 5;
    }

    @Override
    public void calcArea() {
        area = pi * r * r;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle implements Shape {
    private int l = 0, b = 0;
    private double area = 0;

    @Override
    public void input() {
        l = 6;
        b = 4;
    }

    @Override
    public void calcArea() {
        area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }
}

public class Program41 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape obj2 = new Rectangle();
        obj1.input();
        obj2.input();
        obj1.calcArea();
        obj2.calcArea();
    }
}
