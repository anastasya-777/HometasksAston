import java.util.*;

// Основной класс Park
public class Park {

    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String openingHours;
        private double price;

        // Конструктор класса Attraction
        public Attraction(String name, String openingHours, double price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        // Геттеры для получения информации об аттракционах
        public String getName() {
            return name;
        }

        public String getOpeningHours() {
            return openingHours;
        }

        public double getPrice() {
            return price;
        }
    }

    // Коллекция для хранения аттракционов парка
    private List<Attraction> attractions;

    // Конструктор основного класса Park
    public Park() {
        attractions = new ArrayList<>();
    }

    // Метод для добавления аттракционов в парке
    public void addAttraction(String name, String openingHours, double price) {
        Attraction attraction = new Attraction(name, openingHours, price);
        attractions.add(attraction);
    }

    // Метод для вывода информации о всех аттракционов парка
    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println("Аттракцион: " + attraction.getName());
            System.out.println("Время работы: " + attraction.getOpeningHours());
            System.out.println("Стоимость: " + attraction.getPrice());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        // Добавляем аттракционы в парк
        park.addAttraction("Карусель", "10:00 - 20:00", 150.0);
        park.addAttraction("Американские горки", "11:00 - 21:00", 200.0);
        park.addAttraction("Лабиринт ужасов", "12:00 - 22:00", 200.0);

        // Выводим информацию о всех аттракционах парка
        park.displayAttractions();
    }
}