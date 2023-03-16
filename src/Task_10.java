/**
 * Task10: Реализуйте метод, сливающий два отсортированных по неубыванию массива
 * чисел в один отсортированный в том же порядке массив.
 * Массивы могут быть любой длины, в том числе нулевой.
 * Input: int[] arr_1, int[] arr_2
 * Output: int[] arr_33
 */
public class Task_10 {
    public static int[] solve(int[] arr_1, int[] arr_2) {
        int cnt_1 = 0; int cnt_2 = 0; int cnt_3 = 0;
        int[] arr_3 = new int[arr_1.length + arr_2.length];

        while (cnt_1 < arr_1.length && cnt_2 < arr_2.length) {
            if (arr_1[cnt_1] > arr_2[cnt_2]) {
                arr_3[cnt_3] = arr_2[cnt_2];
                cnt_2++; cnt_3++;
            } else {
                arr_3[cnt_3] = arr_1[cnt_1];
                cnt_1++; cnt_3++;
            }
        }

        while (cnt_1 < arr_1.length) {
            arr_3[cnt_3] = arr_1[cnt_1];
            cnt_1++; cnt_3++;
        }

        while (cnt_2 < arr_2.length) {
            arr_3[cnt_3] = arr_2[cnt_2];
            cnt_2++; cnt_3++;
        }

        return arr_3;
    }
}
