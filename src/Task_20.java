import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * Task20: Напишите программу, которая будет преобразовывать переводы строк из формата Windows ('\r \n') в формат Unix ('\n'). 
 * Input: Поток байт System.in
 * Output: Строка в System.out
 */
public class Task_20 {
    public static void solve() {
        try {
            InputStream inputStream = new ByteArrayInputStream(new byte[] { 65, 13, 10, 10, 13 });
            int r;
            ArrayList<Integer> arr = new ArrayList<>();
            while ((r = inputStream.read()) != -1) {
                arr.add(r);
            }

            for (int i = 0; i < arr.size(); i++) {
                if (i != arr.size() - 1 && arr.get(i) == 13 && arr.get(i + 1) == 10) {
                    arr.remove(i);
                }
            }

            System.out.println(arr.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
