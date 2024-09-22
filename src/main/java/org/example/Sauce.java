package org.example;

public class Sauce {
    private String name;
    private Spiciness spiciness;

    public enum Spiciness{
        VERY_SPICY("ОЧЕНЬ ОСТРЫЙ"),
        SPICY("ОСТРЫЙ"),
        NOT_SPICY("НЕ ОСТРЫЙ");

        private final String description;

        Spiciness(String description) {
            this.description = description;
        }
    }

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.description;
    }
}

/*Создайте класс Соус, который описывается:

Название: строка
Острота: одно из {очень острый, острый, не острый}
При создании требует указать название и остроту
Может возвращать текстовое представление вида “Соус НАЗВАНИЕ: ОСТРОТА”
Гарантируйте, что острота соуса может указываться только одним из предопределенных значений.*/