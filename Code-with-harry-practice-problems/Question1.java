/*
 ? This is practice question of code with harry video no 60
 Todo -->> Create an abstract class Pen which has abstract methods write and refill
 @ Create a concrete class FountainPen which will inherit the Pen and have an additional method changeNib()
 * Create an object of fountain pen and show the implementation. 
 */
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writting in fountain pen.");
    }

    void refill() {
        System.out.println("Refilling the fountain pen.");
    }

    public void changeNib() {
        System.out.println("Changing the nib of the fountain pen.");
    }

}

// public class Question1 {
//     public static void main(String[] args) {
//         FountainPen parker = new FountainPen();
//         parker.changeNib();
//         parker.refill();
//         parker.write();
//     }
// }
