public class Floor {
    private double length;
    private double width;

    public Floor(double lenght, double width) {
        if (lenght < 0) {
            this.length = 0;
        }
        else {
            this.length = lenght;
        }
        if (lenght < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }

    }
    public double getArea() {
        return (width * length);
    }
}
