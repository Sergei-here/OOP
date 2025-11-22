public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0)
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным или равным 0");
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int newDenominator = this.denominator * other.denominator;
        int firstNumerator = this.numerator * other.denominator;
        int secondNumerator = this.denominator * other.numerator;
        int newNumerator = firstNumerator + secondNumerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int number) {
        Fraction numberFraction = new Fraction(number, 1);
        return this.sum(numberFraction);
    }

    public Fraction minus(Fraction other) {
        int newDenominator = this.denominator * other.denominator;
        int firstNumerator = this.numerator * other.denominator;
        int secondNumerator = this.denominator * other.numerator;
        int newNumerator = firstNumerator - secondNumerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int number) {
        Fraction numberFraction = new Fraction(number, 1);
        return this.minus(numberFraction);
    }
}
