package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        Dog dog = new Dog("Rex", "Bulldog", 5);

        System.out.println("Before nulling:");
        System.out.println(cat);
        System.out.println(dog);

        nullifyFields(cat);
        nullifyFields(dog);

        System.out.println("After nulling:");
        System.out.println(cat);
        System.out.println(dog);
    }

    public static void nullifyFields(Object obj) throws IllegalAccessException {
        Class<?> objectClass = obj.getClass();
        Field[] fields = objectClass.getDeclaredFields();

        for (Field field : fields) {
            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                if (!field.getType().isPrimitive()) {
                    field.setAccessible(true);
                    field.set(obj, null);
                }
            }
        }
    }
}
