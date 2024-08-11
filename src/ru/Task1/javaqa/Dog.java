package ru.Task1.javaqa;

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super();
        runLimit = 500;
        swimLimit = 10;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Собака пробежала " + distance + " метров.");
        } else {
            System.out.println("Собака не может пробежать больше " + runLimit + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Собака проплыла " + distance + " метров.");
        } else {
            System.out.println("Собака не может проплыть больше " + swimLimit + " метров.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}