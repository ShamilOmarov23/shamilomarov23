package Task_1_2_13;

public class Circle {
    public static void main(String[] args) {
        double radius = calcCircleRaduis(3.147, 123);
        System.out.printf("%.3f",radius);
    }

    public static double calcCircleRaduis(double pi, double area) {
        double radius = Math.sqrt(area / pi);
        return radius;
    }
}