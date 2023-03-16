/**
 * Task7: Реализуйте метод, проверяющий, является ли заданное число по
 * абсолютной величине степенью двойки.
 * Input: int num
 * Output: boolean is_pow
 */
public class Task_7 {
    public static boolean solve(int num) {
        num = Math.abs(num);
        return num == Integer.highestOneBit(num);
    }
}
