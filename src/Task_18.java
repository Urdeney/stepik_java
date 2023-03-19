import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Task18: Напишите метод, читающий входной поток данных, и вычисляющий
 * контрольную сумму прочитанных данных.
 * Контрольная сумма вычисляется по следующему алгоритму:
 * 1) Контрольная сумма имеет тип данных int. Контрольная сумма пустого набора
 * данных равна нулю.
 * 2) Формула контрольной суммы непустого набора данных: C_n+1 = rotateLeft(С_n)
 * xor b_n+1
 * где С_n - контр. сумма первых n байт данных, b_n - n-ный байт данных.
 * Input: None
 * Output: int
 */

public class Task_18 {
    public static void solve() {
        InputStream inputStream = new ByteArrayInputStream(new byte[] { 0x33, 0x45, 0x01 });
        try {
            System.out.println(checkSumOfStream(inputStream));
            inputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static int checkSumOfStream(InputStream inputStream) throws IOException {
        int flag = 0;
        ArrayList<Byte> arr = new ArrayList<>();
        while (true) {
            flag = inputStream.read();
            if (flag == -1) {
                break;
            }
            if (flag == -1 && arr.isEmpty()) {
                return 0;
            }
            System.out.println(flag);
            arr.add((byte) flag);
        }
        return SumStreamRecur(arr, arr.size() - 1);
    }

    static int SumStreamRecur(ArrayList<Byte> arr, int counter) {
        if (counter < 0) {
            return 0;
        } else {
            return (2 * SumStreamRecur(arr, counter - 1)) ^ arr.get(counter);
        }
    }
}
