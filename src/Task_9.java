import java.math.BigInteger;

/**
 * Task9: Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * Input: int value
 * Output: BigInteger res
 * P.S.: В данном решении используются тернарный операто и рекурсия
 */
public class Task_9 {
    public static BigInteger solve(int value) {
        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(solve(value - 1));
    }
    /*
     * valueOf(long val) Returns a BigInteger whose value is equal to that of the
     * specified long.
     */
}
