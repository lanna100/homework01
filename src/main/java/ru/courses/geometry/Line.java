package ru.courses.geometry;
import ru.courses.geometry.interfaces.Measurable;

public class Line implements Measurable {
    Point coordinateOrigin;
    Point coordinateEnd;

    public Line(Point coordinateOrigin, Point coordinateEnd) {
        this.coordinateOrigin = coordinateOrigin;
        this.coordinateEnd = coordinateEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.coordinateOrigin = new Point(x1, y1);
        this.coordinateEnd = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Линия от {" + coordinateOrigin.coordinateX +
                ";" + coordinateOrigin.coordinateY +
                "} до {" + coordinateEnd.coordinateX +
                ";" + coordinateEnd.coordinateY +
                "}";
    }

    public double getLength() {
        int a = coordinateEnd.coordinateX - coordinateOrigin.coordinateX;
        int b = coordinateEnd.coordinateY - coordinateOrigin.coordinateY;
        return Math.sqrt(a * a + b * b);
    }
}
/*

Может вернуть длину Линии. Для расчёта длины следует использовать формулу расчёта гипотенузы: корень суммы квадратов катетов.
Для извлечения корня можно использовать Math.sqrt.  */