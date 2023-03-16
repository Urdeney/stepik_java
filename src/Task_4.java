/**
 * Task4: Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b =
 * c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Input: double a , double b , double c
 * Output: boolean res
 */
public class Task_4 {
    public static boolean solve(double a, double b, double c) {
        double sum = a + b;
        double eps = 1e-4d;
        boolean res = Math.abs(sum - c) < eps;
        return res;
    }
}
