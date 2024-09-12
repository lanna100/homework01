package org.example;

import static org.example.Fraction.sumAll;

public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(3, 5);
        double result1 = sumAll(2 , f1 , 2.3);
        System.out.println("Сумма1 = " + result1);

        Fraction f2 = new Fraction(49, 12);
        Fraction f3 = new Fraction(3, 2);
        double result2 = sumAll(3.6, f2, 3, f3);
        System.out.println("Сумма2 = " + result2);

        // Задание 3: 3/4 + 1/2 + 2/3
        Fraction f4 = new Fraction(1, 3);
        double result3 = sumAll(f4, 1);
        System.out.println("Сумма3 = " + result3);
    }
}
