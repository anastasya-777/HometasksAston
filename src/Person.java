public class Person {
    public static void main(String[] args) {
        // объявляем массив объектов класса Employee
        Employee[] employeesArray = new Employee[5];

        // задаем объекты для каждой ячейки массива
        employeesArray[0] = new Employee("Иван", "Иванов", "Иванович", "Разработчик", "ivan.ivanov@example.com", "+79001234567", 50000, 25);
        employeesArray[1] = new Employee("Петр", "Петров", "Петрович", "Аналитик", "petr.petrov@example.com", "+7900567890", 60000, 30);
        employeesArray[2] = new Employee("Светлана", "Светлова", "Светловна", "Менеджер", "svetlana.svetlova@example.com", "+7901234567", 70000, 35);
        employeesArray[3] = new Employee("Алексей", "Алексеев", "Алексеевич", "Дизайнер", "aleksey.alekseev@example.com", "+7901678901", 80000, 40);
        employeesArray[4] = new Employee("Мария", "Маринова", "Мариновна", "Маркетолог", "maria.marinova@example.com", "+7902345678", 90000, 45);

        // выводим информацию о сотрудниках в консоль
        for (Employee employee : employeesArray) {
            employee.printInfo();
        }
    }

}
