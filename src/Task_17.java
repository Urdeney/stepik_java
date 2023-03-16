/**
 * Task17: Реализуете метод, позволяющий другим методам узнать, откуда их
 * вызвали. Метод getCallerClassAndMethodName() должен возвращать имя класса и
 * метода, откуда вызван метод, вызвавший данный утилитный метод. Или null, если
 * метод вызвавщий getCallerClassAndMethodName() является точкой входа в
 * программу, т.е. его никто не вызывал.
 * Input: void
 * Output: String
 */
public class Task_17 {
    public static void solve() {
        Test.main(null);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(String.format("Функция Test#main была вызвана %s", getCallerClassAndMethodName()));
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(String.format("Функция Test#anotherMethod была вызвана %s", getCallerClassAndMethodName()));
    }

    public static String getCallerClassAndMethodName() {
        Exception e = new Exception();
        StackTraceElement[] trace = e.getStackTrace();
        // System.out.println(Arrays.toString(trace));
        if (trace.length < 3) {
            return null;
        }
        String last_call_func = trace[2].toString();
        return last_call_func.substring(0, last_call_func.indexOf("(")).replace(".", "#");
    }
}