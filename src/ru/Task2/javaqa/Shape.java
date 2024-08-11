package ru.Task2.javaqa;

interface Shape {
    // Дефолтный метод для расчета периметра
    default double calculatePerimeter() {
        return 0;
    }

    // Метод для расчета площади
    double calculateArea();

    // Методы для получения цвета
    String getFillColor();
    String getBorderColor();
}
