package org.example;

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

class Point3D extends Point {
    int coordinateZ;

    public Point3D(int coordinateX, int coordinateY, int coordinateZ) {
        super(coordinateX, coordinateY);
        this.coordinateZ = coordinateZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY+
                ", coordinateZ=" + coordinateZ +
                "}";
    }
}




