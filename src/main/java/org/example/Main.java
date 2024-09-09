package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point[] points = {new Point(1, 5), new Point(2, 8),
                new Point(5, 3), new Point(8, 9)};
        PolyLine polyLine = new PolyLine(points);
        System.out.println("---------- Ломаная линия ----------");
        System.out.println(polyLine);
        System.out.println("Длина ломаной линии = " + polyLine.getLength());
        System.out.println(Arrays.toString(polyLine.getLines()));

        System.out.println("----- Замкнутая ломаная линия -----");
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(points);
        System.out.println(closedPolyLine);
        System.out.println("Длина замкнутой ломаной линии = " + closedPolyLine.getLength());
        System.out.println(Arrays.toString(closedPolyLine.getLines()));

    }
}
