/**
 * Task11: Вам дан список ролей и сценарий пьесы в виде массива строчек.
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста.
 * Input: String[] roles, String[] textLines
 * Output: String res
 */
public class Task_11 {
    public static String solve(String[] roles, String[] textLines){
        StringBuilder res_text = new StringBuilder();
        for (String role : roles){
            res_text.append(role + ":" +"\n");
            
            for (int i = 0; i < textLines.length; i++){
                if (textLines[i].indexOf(role) != -1)
                {
                    var trim_text = textLines[i].replaceFirst(role+":\s", "");
                    res_text.append(String.format("%d) %s\n",i+1,trim_text));
                }

            }
            res_text.append("\n");
        }
        String res = res_text.toString();
        return res;
    }
}
