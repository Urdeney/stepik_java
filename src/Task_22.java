/*
 * Task22: Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой. 
 * Input: Поток байт System.in
 * Output: Поток символов в System.out
 */
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task_22 {
    public static void solve(){
        String input = "-1e3\r\n" +
                        "18 .111 11bbb";
        ArrayList <Double> arr= new ArrayList<>();
        Scanner scanner = new Scanner(input).useLocale(Locale.forLanguageTag("en"));
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {arr.add(scanner.nextDouble());}
            else {scanner.next();}
        }
        
        Double sum = arr.stream().mapToDouble(Double::doubleValue).sum(); // Использование коллекций
        
        try (OutputStreamWriter writer = new OutputStreamWriter(System.out);){
            writer.write(arr.toString() + "\n");
            writer.write(String.format("%.6f",sum));
        }
        
        catch (IOException e) {System.out.println(e.getMessage());}

    }

}
