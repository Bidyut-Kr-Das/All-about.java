package exercise;

import Shadow.Frost.Shape;

public class Rectangle extends Shape {
    @Override
    public void setDimension(double length, double width) {
        super.setDimension(length, width);
    }

    public double calcArea() {
        double area = this.getLength() * this.getwidth();
        return area;
    }
}
