package Task_1_2_10;

public class MathTypes {
    public static void main(String[] args) {
        boolean d = doubleExpression(2.0, 2.0, 4.0);
        System.out.println("d = " + d);
    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean d = false;
        if (Math.abs((a + b) - c) <= 1E-4) {
            d = true;
        }
        return d;
    }
}