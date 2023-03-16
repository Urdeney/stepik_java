/**
 * Task2: Реализуйте метод, возвращающий true, если среди четырех его аргументов
 * ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 * Input: boolean a , boolean b , boolean c , boolean d
 * Output: bolean res
 */
public class Task_2 {
    public static boolean solve(boolean a, boolean b, boolean c, boolean d) {
        Integer count = 0;
        Solver s = (x) -> {
            if (x)
                return 1;
            else
                return 0;
        };
        count += s.solve(a) + s.solve(b) + s.solve(c) + s.solve(d);
        return count == 2;
    }
}

@FunctionalInterface
interface Solver {

    int solve(boolean n);
}
