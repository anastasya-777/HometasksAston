public class Employee {
    // Поля класса Employee
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Employee(String surname, String name, String patronymic, String position, String email, String phone, double salary, int age) {
        // Конструктор класса Employee.
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        //Вывод информации о сотруднике в консоль.
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        // Создание объекта класса Employee
        Employee employee = new Employee("Иванов", "Иван", "Иванович", "Инженер", "ivanov@example.com", "+7-999-123-45-67", 50000.0, 30);

        // Вызыв метода printInfo() для вывода информации о сотруднике
        employee.printInfo();
    }
}