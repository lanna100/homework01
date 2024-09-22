package ru.courses.geometry;

import ru.courses.geometry.interfaces.Measurable;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Arrays.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}


