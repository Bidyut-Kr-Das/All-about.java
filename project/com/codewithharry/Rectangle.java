package com.codewithharry;

// import com.codewithharry.Shape;

public class Rectangle extends Shape {
    // Default constructor to set dimentions 0
    public Rectangle() {
        super.setDimension(0, 0);
    }

    // parameterised constructor
    public Rectangle(double length, double width) {
        super.setDimension(length, width);
    }

    @Override
    public void setDimension(double length, double width) {
        // System.out.println("hello from rectangle");
        super.setDimension(length, width);
    }

    public void calcArea() {
        /*
         * Calculates area of rectangle
         */
        double area = this.getLength() * this.getwidth();
        System.out.println("The area of Rectangle: " + area);
    }
}
