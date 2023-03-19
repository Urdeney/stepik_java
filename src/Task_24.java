import java.util.HashSet;
import java.util.Set;

/*
 * Task24: Реализуйте метод, вычисляющий симметрическую разность двух множеств. 
 * Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
 * Input: Set <? extends T> , Set<? extends T>
 * Output: <T> Set<T>
 */
public class Task_24 {
    public static void solve() {
        Set<Integer> set_1 = Set.of(1, 2, 3);
        Set<Integer> set_2 = Set.of(0, 1, 2);

        Set set_res = symmetricDifference(set_1, set_2);

        System.out.println(set_res.toString());

    }

    static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> copy_set1 = new HashSet<>(set1);
        Set<T> copy_set2 = new HashSet<>(set2);

        Set<T> cross_set = new HashSet<>() {{
                addAll(copy_set1);
                retainAll(copy_set2);
        }};

        copy_set1.addAll(copy_set2);
        copy_set1.removeIf(cross_set::contains);

        return copy_set1;

    }
}
