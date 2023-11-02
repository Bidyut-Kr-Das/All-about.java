package Shadow.Frost;

public class Shape {
    protected double length, width, radius;

    protected void setDimension(double l) {
        /*
         * parameter lenght of shape
         */
        // this.length = args.length < 2 ? args[0] : -1;
        this.length = l;
        this.width = -1;
        this.radius = -1;
    }

    protected void setDimension(double l, double w) {
        /*
         * (length, width)
         */
        this.length = l;
        this.width = w;
        this.radius = -1;
    }

    protected void setDimension(double l, double w, double r) {
        /*
         * (length, width, radius)
         */
        this.length = l;
        this.width = w;
        this.radius = r;
    }

    protected double getLength() {
        return this.length;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double getwidth() {
        return this.width;
    }
}

// public class cwh_exe1 {
// // public static void main(String[] args) {
// // Rectangle r1 = new Rectangle();
// // r1.width = 1;
// // }
// }
