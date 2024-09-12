package org.example;

public class Main {
    public static void main(String[] args) {
        //Fraction f0 = new Fraction(7, 0);
        Fraction f1 = new Fraction(1, 3); // 1/3
        Fraction f2 = new Fraction(2, 5); // 2/5
        Fraction f3 = new Fraction(7, 8); // 7/8

        Fraction result = f1.sum(f2).sum(f3).diff(5);
        System.out.println("Результат: " + result);

        System.out.println(f1.intValue());
        System.out.println(f1.doubleValue());
        System.out.println(f1.longValue());
        System.out.println(f1.floatValue());
    }
}
