import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * TasK29: Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр.
 * Подсчет слов должен выполняться без учета регистра, выводите слова в нижнем регистре.
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
 * то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
 */
public class Task_29 {

    private static Comparator<Map.Entry<String, Integer>> descendingFrequencyOrder() {
        return Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey);
    }

    public static void solve() {
        String input = "Мама мыла-мыла-мыла раму!";
        List<String> ls = new Scanner(input.toLowerCase()).useDelimiter("[^а-яa-z0-9]+").tokens().toList();

        HashMap<String, Integer> freqmap = new HashMap<>();

        for (String str : ls) {
            if (freqmap.containsKey(str)) {
                freqmap.computeIfPresent(str, (String s, Integer i) -> ++i);
            } else {
                freqmap.put(str, 1);
            }
        }

        freqmap.entrySet().stream().sorted(descendingFrequencyOrder()).limit(10).map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
