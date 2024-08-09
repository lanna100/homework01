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


/*Создайте класс Точка, расположенную на двумерной плоскости, которая описывается:

Координата Х: число
Координата Y: число
При создании требует указать обе координаты
Может возвращать текстовое представление вида “{X;Y}”
Далее необходимо создать три объекта точки: {1;3} {1;3} {5;8}

Выведите на экран текстовое представление этих точек и результат сравнения точек между собой. Убедитесь, что оба сравнения дали false.*/