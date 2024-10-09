package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private static String breed = "Persian";
    public String name;
    private int age;
    private List<String> friendsName = new ArrayList<>();

    public Cat(String name, int age, List<String> friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }
}

    class Dog {
        public String name;
        private String breed;
        private int age;

        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", age=" + age +
                    '}';
        }
}
