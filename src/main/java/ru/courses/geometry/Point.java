package ru.courses.geometry;

public class Point {
    int coordinateX;
    int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "{" + coordinateX + ";" + coordinateY + '}';
    }
}
