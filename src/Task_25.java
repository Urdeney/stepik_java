import java.util.Scanner;

/*
 * Task25:Напишите программу, которая прочитает из System.in последовательность целых чисел,
 * разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
 * в обратном порядке в System.out.Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 */
public class Task_25 {
    public static void solve() {
        String str = "1 2 3 4 5 6 7";
        Scanner scanner = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        int cnt = 0;

        while (scanner.hasNextInt()) {
            if (cnt % 2 != 0) {
                res.append(scanner.nextInt());
                res.append(" ");
            } else {
                scanner.next();
            }
            cnt++;
        }

        res.delete(res.length() - 1, res.length());
        System.out.println(res.reverse().toString());

    }
}
