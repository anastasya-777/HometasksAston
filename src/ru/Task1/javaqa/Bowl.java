package ru.Task1.javaqa;

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " единиц еды в миску.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public void deductFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            System.out.println("Недостаточно еды в миске для вычитания.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

