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
        noOfScorpio++;
    }

    static void productionStarted() {
        noOfScorpio = 0;
    }

    void showParts() {
        System.out.println("Tyres: " + tyres);
        System.out.println("Seats: " + seat);
        System.out.println("HeadLight: " + headlight);
        System.out.println("power of engine: " + enginePower);

    }

    void displayScorpio() {
        System.out.println("Total scorpio" + noOfScorpio);
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
        // noOfScorpio++;
        scorpioIncreased();
    }

    // constructor overloaded
    // parameterised constructor
    Car(int noTyres, int noheadlight, int noSeats, String powerEngine) {
        tyres = noTyres;
        headlight = noheadlight;
        seat = noSeats;
        enginePower = powerEngine;
        scorpioIncreased();
    }

}

public class Company {
    public static void main(String[] args) {
        Car.productionStarted();
        Car scorpio1 = new Car();// noOFscorpio = 1
        Car scorpio2 = new Car();// noOFscorpio = 2
        Car scorpio3 = new Car(); // noOFscorpio = 3
        Car scorpio4 = new Car();// noOFscorpio = 4
        Car scorpio5 = new Car();// noOFscorpio = 5
        // noOFscorpio = 1

        scorpio5.displayScorpio();
        scorpio1.displayScorpio();

    }
}
/*
 * 
 * 
 * class{
 * //? instance variable
 * //? static instance variable
 * //? methods
 * //? static methods
 * //? constructor
 * //? parameterised constructor
 * //! copy constructor - takes another object as an argument and copy all
 * //!values of instance varable
 * }
 * 
 * how can we create an object?
 * explanation of the syntax of object creation?
 * how can we access static methods and static variables?
 */
