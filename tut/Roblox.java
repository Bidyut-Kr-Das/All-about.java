public class Roblox {
    private int robux;

    public void pay(int amount) {
        robux = amount;
    }
}

class unlimitedMoney extends Roblox {
    void unimited() {
        pay(9999);
    }
}
