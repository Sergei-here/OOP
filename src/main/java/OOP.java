public class OOP {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        System.out.println("Дробь 1: " + f1);
        Fraction f2 = new Fraction(2, 5);
        System.out.println("Дробь 2: " + f2);
        Fraction f3 = new Fraction(7, 8);
        System.out.println("Дробь 3: " + f3);
        Fraction result =  f1.sum(f2).sum(f3).minus(5);
        System.out.println("Резульат сложения и вычитания: " + result);
    }
}
