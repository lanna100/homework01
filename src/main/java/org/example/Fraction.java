package org.example;

class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <=0) {throw new IllegalArgumentException("Знаменатель не может быть <= 0");}
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction newFraction){
        int sumNumerator = this.numerator * newFraction.denominator + newFraction.numerator * this.denominator;
        int sumDenominator = this.denominator * newFraction.denominator;
        return new Fraction(sumNumerator, sumDenominator);
    }

    public Fraction diff(Fraction newFraction) {
        int diffNumerator = this.numerator * newFraction.denominator - newFraction.numerator * this.denominator;
        int diffDenominator = this.denominator * newFraction.denominator;
        return new Fraction(diffNumerator, diffDenominator);
    }

    public Fraction sum(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    // Метод вычитания дроби с целым числом
    public Fraction diff(int integer) {
        return this.diff(new Fraction(integer, 1));
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
