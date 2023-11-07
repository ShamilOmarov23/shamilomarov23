package Task_1_2_7;

public class AriphmeticOperations {
    public static void main(String[] args){
        double allPrises = priceCalculation(9.55, 4);
        System.out.println("allPrises = " + allPrises);
    }
    public static double priceCalculation(double price, int count) {
        double result = price*count;
        return result;
    }
}
