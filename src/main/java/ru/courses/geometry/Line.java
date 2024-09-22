package ru.courses.geometry;
import ru.courses.geometry.interfaces.Measurable;

import java.util.Objects;

public class Line implements Measurable, Cloneable {
    Point coordinateStart;
    Point coordinateEnd;

    public Line(Point coordinateStart, Point coordinateEnd) {
        this.coordinateStart = coordinateStart;
        this.coordinateEnd = coordinateEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.coordinateStart = new Point(x1, y1);
        this.coordinateEnd = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Линия от {" + coordinateStart.coordinateX +
                ";" + coordinateStart.coordinateY +
                "} до {" + coordinateEnd.coordinateX +
                ";" + coordinateEnd.coordinateY +
                "}";
    }

    public double getLength() {
        int a = coordinateEnd.coordinateX - coordinateStart.coordinateX;
        int b = coordinateEnd.coordinateY - coordinateStart.coordinateY;
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        //return coordinateOrigin.equals(line.coordinateOrigin) && coordinateEnd.equals(line.coordinateEnd);
        return Objects.equals(coordinateStart, line.coordinateStart) && Objects.equals(coordinateEnd, line.coordinateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateStart, coordinateEnd);
    }

    public Object clone() throws CloneNotSupportedException {
        Line clonedLine = (Line) super.clone();
        clonedLine.coordinateStart = (Point) coordinateStart.clone();
        clonedLine.coordinateEnd = (Point) coordinateEnd.clone();
        return clonedLine;
    }
}
