import java.util.*;

public class PhoneBook {
    // Хранение фамилий и связанных с ними телефонных номеров
    private Map<String, List<String>> phoneBook = new HashMap<>();

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        // Получаем список номеров телефонов для данной фамилии
        List<String> phoneNumbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        // Добавляем новый номер телефона в список
        phoneNumbers.add(phoneNumber);
        // Сохраняем обновленный список в телефонный справочник
        phoneBook.put(lastName, phoneNumbers);
    }

    // Метод для поиска номеров телефонов по фамилии
    public List<String> get(String lastName) {
        // Возвращаем список номеров телефонов для данной фамилии или пустой список, если фамилия не найдена
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        myPhoneBook.add("Иванов", "123-456-7890");
        myPhoneBook.add("Иванов", "987-654-3210");
        myPhoneBook.add("Петров", "555-555-5555");
        myPhoneBook.add("Сидоров", "444-444-4444");

        // Ищем номера телефонов по фамилии
        System.out.println("Телефоны для фамилии 'Иванов': " + myPhoneBook.get("Иванов"));
        System.out.println("Телефоны для фамилии 'Петров': " + myPhoneBook.get("Петров"));
        System.out.println("Телефоны для фамилии 'Сидоров': " + myPhoneBook.get("Сидоров"));
        System.out.println("Телефоны для фамилии 'Кузнецов': " + myPhoneBook.get("Кузнецов"));  // Не существующая фамилия
    }
}
