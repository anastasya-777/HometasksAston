package ru.Task1.javaqa;

class Animal {
    int runLimit;
    int swimLimit;
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " метров.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}