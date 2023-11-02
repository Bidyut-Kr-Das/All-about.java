class phone {
    public void switchOn() {
        System.out.println("Turning on the phone.");
    }
}

class smartPhone extends phone {
    @Override
    public void switchOn() {
        System.out.println("Turning on the smart Phone");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }

}

public class inheritanceTest {
    public static void main(String[] args) {
        phone p1 = new smartPhone();
        p1.switchOn();
        p1.playMusic();

    }
}
