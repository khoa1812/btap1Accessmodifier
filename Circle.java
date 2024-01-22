package btap1;

public class Circle {

    private static final double PI = 3.14;
    private static int count = 0;
    private static double maxRadius = 0;
    private static double totalArea = 0;
    private int id;
    private double radius;

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public static int getCount() {
        return count;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.id = ++count;
        totalArea += area();
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }



}
