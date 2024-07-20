public class Main {
    //1. Метод printThreeWords() при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }


    // 2. Метод checkSumSign() суммирует две переменные и выводит сообщение о знаке суммы.
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод определяет цвет в зависимости от значения
    public static void printColor() {
        int value = 50; // Пример значения

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод compareNumbers() сравнивает два числа и выводит результат.
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Метод проверяет, что сумма двух чисел лежит в диапазоне от 10 до 20 включительно.
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            }
        }
        return false;
    }

    // 6. Метод выводит, положительное ли число.
    public static void printPositiveNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    // 7. Метод возвращает true, если число отрицательное.
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    // 8. Метод выводит строку указанное количество раз.
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Метод определяет, является ли год високосным.
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // 10. Метод меняет 0 на 1 и 1 на 0 в массиве.
    public static void invertArray(int[] array) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length;i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // 11. Метод заполняет массив значениями от 1 до 100.
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12. Метод умножает числа меньше 6 на 2.
    public static void multiplyLessThanSix() {
        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6) {
                newArray[i] *= 2;
            }
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    //13. Метод заполняет обе диагонали квадратной матрицы единицами
    public static void fillDiagonalWithOnes(int[][] matrix) {
        int n = 5; // Размер квадратной матрицы
        int[][] squareMatrix = new int[n][n]; // Создание квадратной матрицы
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // 14. Метод создает одномерный массив заданной длины, заполненный указанным значением
    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }


    public static void main(String[] args) {
        // Вызовы методов
        printThreeWords();//1

        checkSumSign();//2

        printColor();//3

        compareNumbers();//4

        System.out.println(checkSumInRange(5, 6));//5

       printPositiveNegative(-3);//6

       System.out.println(isNegative(-1));//7

        printStringMultipleTimes("Hello", 3);//8

       System.out.println(isLeapYear(2024));//9

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array);//10


        int[] filledArray = fillArray();//11
        for (int num : filledArray) {
           System.out.print(num + " ");
       }
       System.out.println();

        multiplyLessThanSix();//12

        //13
        int n = 5; // Размер квадратной матрицы
        int[][] squareMatrix = new int[n][n]; // Создание квадратной матрицы
        fillDiagonalWithOnes(squareMatrix);
        // Вывод заполненной матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //14
        int len = 5; // Длина массива
        int initialValue = 10; // Значение для заполнения массива
        int[] resultArray = createArray(len, initialValue);
        // Вывод массива на экран
        for (int num : resultArray) {
            System.out.print(num + " ");
        }

    }

}
