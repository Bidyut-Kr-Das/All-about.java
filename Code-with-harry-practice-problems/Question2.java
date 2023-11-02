package Cwh;

class Monkey {
    public void jump() {
        System.out.println("The monkey is jumping.");
    }

    protected void bite() {
        System.out.println("The monkey is bitting.");
    }

}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void jump() {
        System.out.println("The human is jumping");
    }

    @Override
    public void bite() {
        System.out.println("The human is bitting.");
    }

    @Override
    public void eat() {
        System.out.println("The human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The human is sleeping.");
    }
}

// public class Question2 {
// public static void main(String[] args) {
// Human bkd = new Human();
// bkd.eat();
// bkd.sleep();
// // bkd.repeat(); -> Throws an error as repeat is not there

// }
// }
