package Shadow.Frost;

import Code-with-harry-practice-problems.Shadow.Frost.Shape;

// D:\Java-Programs-rough\Code-with-harry-practice-problems
public class Square extends Shape {
    @Override
    public void setDimension(double length) {
        super.setDimension(length);
    }

    public double calcArea() {
        double area = this.getLength() * this.getLength();
        return area;
    }
}
