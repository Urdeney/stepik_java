import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/*
 * Task27: Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации основан на функции mid.
 * Input: int seed
 * Output: IntStream
 */
public class Task_27 {

    private static IntUnaryOperator mid = s -> {
        int pow = s * s;
        return pow % 10000 / 10;
    };

    public static void solve() {
        int seed = 13;
        IntStream res = pseudoRandomStream(seed);
        System.out.println(Arrays.toString(res.limit(10).toArray()));
    }

    private static IntStream pseudoRandomStream(int seed) {
        IntStream stream = IntStream.iterate(seed, mid);
        return stream;
    }
}
