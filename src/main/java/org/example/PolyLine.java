package org.example;

import java.util.Arrays;

public class PolyLine implements Measurable {
    Point[] points;

    public PolyLine(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " +
                Arrays.toString(points);
    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength() {
        double polyLineLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Line line = new Line(points[i], points[i + 1]);
            polyLineLength += line.getLength();
        }
        return polyLineLength;
    }
}

class ClosedPolyLine extends PolyLine implements Measurable{
    public ClosedPolyLine(Point[] points) {
        super(points);
        /*if (points.length > 0 && !points[0].equals(points[points.length - 1])) {
            throw new IllegalArgumentException("Это не замкнутая линия. Первый и последний элементы должны совпадать для замкнутой ломаной.");
        }*/
    }
    public String toString() {
        return super.toString() + " + последняя точка " +
                points[0];
    }

    public double getLength() {
        double closedPolyLineLength = super.getLength();
        Line closingLine = new Line(points[points.length - 1], points[0]);
        closedPolyLineLength += closingLine.getLength();
        return closedPolyLineLength;
    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        lines[points.length - 1] = new Line(points[points.length - 1], points[0]); //замыкающая линия
        return lines;
    }

}
