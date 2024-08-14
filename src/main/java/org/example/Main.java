package org.example;

public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(new Point(1,3),new Point(5,8));
        Line line2 = new Line(new Point(10,11),new Point(15,19));
        Line line3 = new Line(line1.coordinateEnd,line2.coordinateEnd);

        System.out.println("Линия 3 до изменения: " + line3);

        line3 = new Line(line1.coordinateEnd = new Point(6,9),line2.coordinateEnd=new Point(16,20));

        System.out.println("Линия 3 после изменения: " + line3);

        System.out.println("Суммарная длина всех трех линий = " + (line1.getLength()+line2.getLength()+line3.getLength()));
    }
}
