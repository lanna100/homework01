package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1,3);
        Point point2 = new Point(5,8);

        Line line = new Line(point1,point2);

        Point[] points = {new Point(1, 5), new Point(2, 8),
                new Point(5, 3), new Point(8, 9)};
        PolyLine polyLine = new PolyLine(points);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(points);

        Measurable[] measurableObjects = {line, polyLine, closedPolyLine};
        printLengths(measurableObjects);

        /*System.out.println("-------------- Линия --------------");
        System.out.println(line);
        System.out.println("Длина линии = " + line.getLength());

        System.out.println("---------- Ломаная линия ----------");
        System.out.println(polyLine);
        System.out.println("Длина ломаной линии = " + polyLine.getLength());
        System.out.println(Arrays.toString(polyLine.getLines()));

        System.out.println("----- Замкнутая ломаная линия -----");
        System.out.println(closedPolyLine);
        System.out.println("Длина замкнутой ломаной линии = " + closedPolyLine.getLength());
        System.out.println(Arrays.toString(closedPolyLine.getLines()));*/


    }

    public static void printLengths(Measurable[] measurableObjects) {
        for (Measurable measurable : measurableObjects) {
            System.out.println("Length: " + measurable.getLength());
        }
    }
}
