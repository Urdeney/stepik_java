import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Task28: Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
 * Найденные минимальный и максимальный элементы передайте в minMaxConsumer
 * Input: Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer
 * Output: void
 */
public class Task_28 {

    private static Comparator<Integer> order = (Integer x, Integer y) -> (x > y ? x : y);
    private static Stream<Integer> stream = Stream.iterate(100, (Integer n) -> n - 5).limit(10);
    private static BiConsumer<Integer, Integer> minMaxConsumer = (Integer x, Integer y) -> System.out
            .println(String.format("Минимальное значение %d , Максимальное значение %d", x, y));

    public static void solve() {
        findMinMax(stream, order, minMaxConsumer);
    }

    static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
