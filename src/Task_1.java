import java.security.MessageDigest;

/**
 * Task1: Простейшее использование функции из пакета java.security
 */
public class Task_1 {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
