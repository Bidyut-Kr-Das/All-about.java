class Measurement {
    private double distanceKM;
    private double distanceM;
    private double distanceMM;

    // constructor
    public Measurement(double distanceKM, double distanceM, double distanceMM) {
        this.distanceKM = distanceKM;
        this.distanceM = distanceM;
        this.distanceMM = distanceMM;
    }

    // method to round of kilometer distance
    public double getRoundKilo() {
        return Math.round(distanceKM);
    }

    // method to round of meter distance
    public double getRoundMeter() {
        return Math.round(distanceM);
    }

    // method to round of milimeter distance
    public double getRoundMilimeter() {
        return Math.round(distanceMM);
    }
}

public class Program29 {
    public static void main(String[] args) {
        Measurement m = new Measurement(5.678, 1234.567, 987654.321);
        System.out.println(m.getRoundKilo());
        System.out.println(m.getRoundMeter());
        System.out.println(m.getRoundMilimeter());
    }
}
