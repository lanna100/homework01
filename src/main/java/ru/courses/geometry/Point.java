package ru.courses.geometry;

import java.util.Objects;

public class Point implements Cloneable{
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        //return coordinateX == point.coordinateX && coordinateY == point.coordinateY;
        return Objects.equals(coordinateX, point.coordinateX) && Objects.equals(coordinateY, point.coordinateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
