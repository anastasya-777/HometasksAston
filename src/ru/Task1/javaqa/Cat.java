package ru.Task1.javaqa;

class Cat extends Animal {
    boolean isFed = false;
    private static int catCount = 0;

    public Cat() {
        super();
        runLimit = 200;
        swimLimit = 0;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Кот пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот не может пробежать больше " + runLimit + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    // Питание кота
    public void feed(int amount, Bowl bowl) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.deductFood(amount);
            this.isFed = true;
            System.out.println("Кот покушал.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}


