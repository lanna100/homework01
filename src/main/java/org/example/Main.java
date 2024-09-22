package org.example;

public class Main {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("ОГНИЩЕ", Sauce.Spiciness.VERY_SPICY);
        Sauce sauce2 = new Sauce("ОГОНЁК", Sauce.Spiciness.SPICY);
        Sauce sauce3 = new Sauce("СЛАДЕНЬКИЙ", Sauce.Spiciness.NOT_SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}
