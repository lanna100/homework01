package ru.courses.main;
import ru.courses.geometry.*;
import ru.courses.geometry.interfaces.Measurable;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Для задания 4: Простые имена
        Point myGeometryPoint = new Point(2, 3);
        java.awt.Point myAwtPoint = new java.awt.Point(4, 5);

        System.out.println("Точка из ru.courses.geometry: " + myGeometryPoint);
        System.out.println("Точка из java.awt: " + myAwtPoint);

        //Для задания 3: Возведение в степень
        if (args.length < 2) {
            System.out.println("Требуются два аргумента.");
            return;
        }

        String xStr = args[0];
        String yStr = args[1];
        double result = calculatePower(xStr, yStr);

        System.out.println("Raising the number " + xStr + " to the power " + yStr + " = " + result);

        //Предыдущие задания:
        /*Point point1 = new Point(1,3);
        Point point2 = new Point(5,8);

        Line line = new Line(point1,point2);

        Point[] points = {new Point(1, 5), new Point(2, 8),
                new Point(5, 3), new Point(8, 9)};
        PolyLine polyLine = new PolyLine(points);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(points);

        Measurable[] measurableObjects = {line, polyLine, closedPolyLine};
        printLengths(measurableObjects);*/

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

    public static double calculatePower(String x, String y) {
        return Math.pow(Integer.parseInt(x), Integer.parseInt(y));
    }

    public static void printLengths(Measurable[] measurableObjects) {
        for (Measurable measurable : measurableObjects) {
            System.out.println("Length: " + measurable.getLength());
        }
    }
}
