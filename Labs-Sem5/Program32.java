class Vehicle {
    protected int maxSpeed = 120;
}

class Car extends Vehicle {
    private int maxSpeed = 180;

    public void display() {
        System.out.println("maximum speed: " + super.maxSpeed);
    }
}

public class Program32 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}
