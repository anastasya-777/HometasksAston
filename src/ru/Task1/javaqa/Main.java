package ru.Task1.javaqa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> catsList = new ArrayList<>();

        catsList.add(new Cat());
        catsList.add(new Cat());

        Bowl bowl = new Bowl(20);

        for (Cat cat : catsList) {
            cat.feed(10, bowl);
            System.out.println(cat.isFed ? "Кот наелся." : "Кот голоден.");
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}