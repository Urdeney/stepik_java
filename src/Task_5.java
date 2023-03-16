/**
 * Task5: Реализуйте метод flipBit, изменяющий значение одного бита заданного
 * целого числа на противоположное.
 * Input: int value , int bitIndex (1 <= bitIndex <= 32)
 * Output: int new_num
 */
public class Task_5 {
    public static int solve(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
