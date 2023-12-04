package Task_1_2_14;

import java.math.BigInteger;

public class BigIntegerr {
    public static void main(String[] args) {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger result = maxLong.multiply(maxLong);
        System.out.println(result);
    }
}