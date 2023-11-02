
//! This is just for my practice you can see if you want.
/*
    TODO --->This calculates the area of triangle using abstract class inheritance 
    ?----> An class Triangle which extends  abstract class Shape.
    @param : none parameters is used but you can use parameters here
    * It is not necessary to have abstract function in abstract class 
    * But if there is an abstract function then the class must be an abstract class.
    
*/
import java.lang.Math;

abstract class Shape {
    public abstract void calcArea();

    public abstract void calcVolume();

    
}


class Triangle extends Shape {
    public int a;
    public int b;
    public int c;

    private int calcHeight() {
        int height = (int) Math.sqrt((Math.pow(b / 2, 2) + Math.pow(a, 2)));
        return height;
    }

    @Override
    public void calcArea() {
        int height = calcHeight();
        double area = 0.5 * b * height;
        System.out.println("The area is " + area);
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculate volume here but triangle has no volume LOL.");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        Triangle equilateral = new Triangle();
        equilateral.a = 5;
        equilateral.b = 5;
        equilateral.c = 5;
        equilateral.calcArea();
    }
}