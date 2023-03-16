import java.util.function.DoubleUnaryOperator;

/**
 * Task14: Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
 * Input: DoubleUnaryOperator функция, double , double
 * Output: double
 */
public class Task_14 {
    public static void solve(){
        System.out.println(integrate(x -> 1, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        final Double n = Double.valueOf(10e6);
        double h = Math.abs(b - a) / n;
        double result = 0;
    
        for(int i = 0; i < n; i++) {
            result +=  f.applyAsDouble(a + h * i);
        }
    
        return result *=h;
    }
}
