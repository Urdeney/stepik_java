/**
 * Task13: Для класса ComplexNumber определить методы equals и hashCode так,
 * чтобы для чисел с одним и тем же
 * Im и Re они выдавали одинаковый результат.
 * Input: void
 * Output: void
 */
public class Task_13 {
    public static void solve() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
    }
}

final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public boolean equals(ComplexNumber other) {
        return (Double.valueOf(this.im).equals(other.im) &&
                Double.valueOf(this.re).equals(other.re));
    }

    public int hashCode() {
        return (Double.hashCode(this.im) + Double.hashCode(this.re));
    }
}