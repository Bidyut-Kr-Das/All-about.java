class Phone {
    public void powerOn() {
        System.out.println("powering on phone");
    }
}

class SmartPhone extends Phone {
    @Override
    public void powerOn() {
        System.out.println("powering on smartPhone");
    }
}

public class inheritance {
    public static void main(String[] args) {
        SmartPhone smobj = new SmartPhone();
        smobj.super.powerOn();
    }
}
