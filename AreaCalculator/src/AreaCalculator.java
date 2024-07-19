public class AreaCalculator {
    // write code here
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return (radius * radius) * 3.141592653589793238462643383279502884197;
        }
    }

    public static double area(double x, double y) {
        double realRadius = x * y;
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return realRadius;
        }
    }
}
