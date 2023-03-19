import java.util.Objects;
import java.util.function.*;
/*
 *Task26: Напишите метод ternaryOperator, который из них построит новую функцию,
 *возвращающую значение функции ifTrue, если предикат выполнен, и значение ifFalse иначе.
 *Input: Predicate<? super T> condition, Function<? super T, ? extends U> ifTrue, Function<? super T, ? extends U> ifFalse
 *Output: <T, U> Function<T, U>
 */

public class Task_26 {
    public static void solve() {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply(""));
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return s -> {
            return condition.test(s) ? ifTrue.apply(s) : ifFalse.apply(s);
        };
    }

}
