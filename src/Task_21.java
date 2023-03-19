import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * Task21: Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 * Input: Поток байт System.in
 * Output: String
 */
public class Task_21 {
    public static void solve() {
        InputStream inputStream = new ByteArrayInputStream(new byte[] { 48, 49, 50, 51 });
        Charset ascii = Charset.forName("US-ASCII");
        String res = readAsString(inputStream, ascii);
        System.out.println(res);

    }

    static String readAsString(InputStream inputStream, Charset charset) {
        byte[] arr = new byte[4];
        try {
            inputStream.read(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new String(arr, charset);
    }
}
