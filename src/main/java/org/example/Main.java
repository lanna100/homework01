package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point[] points = {new Point(1, 5), new Point(2, 8),
                new Point(5, 3), new Point(8, 9)};
        PolyLine polyLine = new PolyLine(points);
        System.out.println(polyLine);
        System.out.println("Длина ломаной линии = " + polyLine.getLength());
        System.out.println(Arrays.toString(polyLine.getLines()));

        Line[] lines = polyLine.getLines();
        System.out.println("Длина массива Линий = " + lines.length);
        double sumLinesLength = 0;
        for (Line line : lines) {
            sumLinesLength += line.getLength();
        }
        System.out.println("Сумма длин линий из массива = " + sumLinesLength);
        System.out.println(polyLine.getLength() == sumLinesLength);
        points[1] = new Point(12, 8);
        System.out.println("Получаем результаты после изменения точки:");
        System.out.println(polyLine);
        System.out.println(Arrays.toString(polyLine.getLines()));
    }
}
