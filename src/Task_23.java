/*
 * Task23: Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
 * Input:
 * Output:
 */

import java.util.Objects;

public class Task_23 {
    public static void solve() {
        Pair<String, String> pair_1 = Pair.of("obj1", "obj2");
        Pair pair_2 = Pair.of("obj1", "obj2");

        System.out.println(pair_1.equals(pair_2));
        System.out.println(pair_1.hashCode() == pair_2.hashCode());
    }

}

class Pair<T, V> {
    private final T obj1;
    private final V obj2;

    private Pair(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public static <T, V> Pair<T, V> of(T obj1, V obj2) {
        return new Pair(obj1, obj2);
    }

    public T getFirst() {
        return this.obj1;
    }

    public V getSecond() {
        return this.obj2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }

        Pair othpair = (Pair) o;

        return Objects.equals(this.obj1, othpair.obj1) && Objects.equals(this.obj2, othpair.obj2);
    }

    @Override
    public int hashCode() {
        int sum = 0;
        sum += this.obj1 != null ? this.obj1.hashCode() : 0;
        sum += this.obj2 != null ? this.obj2.hashCode() : 0;
        return sum;
    }

}
