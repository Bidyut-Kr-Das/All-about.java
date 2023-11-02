package com.codewithharry;

// import com.codewithharry.Shape;

public class Square extends Shape {
    @Override
    public void setDimension(double length) {
        super.setDimension(length);
    }

    public void calcArea() {
        double area = this.getLength() * this.getLength();
        System.out.println("The area of square: " + area);
    }
}
