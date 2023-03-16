import java.io.IOException;
import java.io.InputStream;

/**
 * Task18: Напишите метод, читающий входной поток данных, и вычисляющий
 * контрольную сумму прочитанных данных.
 * Контрольная сумма вычисляется по следующему алгоритму:
 * 1) Контрольная сумма имеет тип данных int. Контрольная сумма пустого набора
 * данных равна нулю.
 * 2) Формула контрольной суммы непустого набора данных: C_n+1 = rotateLeft(С_n) xor b_n+1
 * где С_n - контр. сумма первых n байт данных, b_n - n-ный байт данных.
 * Input:
 * Output:
 */
public class Task_18 {
    public static void solve() {
        //var st = new InputStream
    }

    static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        return sum;
    }

    static int recurCheckSum(int check_sum_old) {

        return 0;
    }
}
