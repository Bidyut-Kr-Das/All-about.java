// import java.util.Scanner;

class Car {
    // data member or instance variable
    int tyres;
    int headlight;
    int seat;
    String enginePower;

    // static data member
    static int noOfScorpio;// static is object independent

    // methods or member function
    void assembleParts(int noTyres, int noheadlight, int noSeats, String powerEngine) {
        tyres = noTyres;
        headlight = noheadlight;
        seat = noSeats;
        enginePower = powerEngine;
    }

    static void scorpioIncreased() {
        // tyres = 5;
        noOfScorpio++;
    }

    void productionStarted() {

    }

    void showParts() {
        System.out.println("Tyres: " + tyres);
        System.out.println("Seats: " + seat);
        System.out.println("HeadLight: " + headlight);
        System.out.println("power of engine: " + enginePower);

    }

    // syntax for constructor
    // default constructor
    Car() {
        // ? This function does not have a return type
        // ? Class name and constructor name is same
        // ? We can not call constructor explicitly

        tyres = 4;
        headlight = 2;
        seat = 4;
        enginePower = "basic";
        noOfScorpio++;
    }

    // constructor overloaded
    // parameterised constructor
    Car(int noTyres, int noheadlight, int noSeats, String powerEngine) {
        tyres = noTyres;
        headlight = noheadlight;
        seat = noSeats;
        enginePower = powerEngine;
    }

}

public class ClassObj {
    public static void main(String[] args) {
        // Car nano = new Car();
        // int counter = 0;
        // Car scorpio1 = new Car();
        // // increment the no of scorpio
        // Car.noOfScorpio = 1;
        // Car scorpio2 = new Car();
        // // increment the no of
        // // Car.noOfScorpio = 2;

        // // nano.tyres = 4;
        // scorpio1.tyres = 5;
        // scorpio2.tyres = 5;

        Car scorpio1 = new Car();
        scorpio1.assembleParts(5, 2, 6, "500 hp");
        Car scorpio2 = new Car();

        // Integer a = new Integer(5);

        scorpio2.assembleParts(6, 2, 10, "800 hp");

        // scorpio1.showParts();
        // scorpio2.showParts();

        Car scorpio3 = new Car();

        // scorpio3.showParts();

        // preorder(if you know which values to use for initialising the datamembers)
        System.out.println("Pre ordered scorpio");
        Car scorpio4 = new Car(10, 4, 2, "1200 hp");
        scorpio4.showParts();

        // scorpio1.

        // Scanner sc = new Scanner(System.in);
        // int a = sc.
    }
}
