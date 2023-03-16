/**
 * Task6: Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE
 * после символа "\" (обратный слэш) на расстоянии a.
 * Input: int a
 * Output: char res
 */
public class Task_6 {
    public static char solve(int a) {
        char res = (char) (92 + a);
        return res;
    }
}
