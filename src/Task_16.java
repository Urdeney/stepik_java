/**
 * Task16: Реализовать свой метод sqrt(), вычисляющий квадратный корень числа. В
 * отличие от Math.sqrt(), этот метод при передаче отрицательного параметра
 * должен бросать исключение java.lang.IllegalArgumentException с сообщением
 * "Expected non-negative number got N", где N - фактически переданное число.
 * Input: double x 
 * Output: doudle res
 */
public class Task_16 {
    public static void solve() {
        double x = 4;
        sqrt(x);
        double y= -4;
        sqrt(y);

    }

    static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException(String.format("Expected non-negative argument got %f",x));
        }
        return Math.sqrt(x);
    }

}
