/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 * Палиндромом называется строка, которая читается одинаково слева направо и
 * справа налево (в том числе пустая).
 * При определении "палиндромности" строки должны учитываться только буквы и
 * цифры.
 * Input: string text
 * Output: boolean res
 */
public class Task_8 {
    public static boolean solve(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev_text = new StringBuilder(text).reverse().toString();
        return text.equals(rev_text);
    }
}
