import java.util.*;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        // Создаем ArrayList с набором слов (включает повторяющиеся слова)
        List<String> wordsList = Arrays.asList(
                "яблоко", "банан", "яблоко", "апельсин", "банан",
                "яблоко", "киви", "банан", "киви", "киви",
                "апельсин", "яблоко", "манго", "манго", "банан", "киви"
        );

        // Используем HashSet для получения уникальных слов
        Set<String> uniqueWords = new HashSet<>(wordsList);

        // Используем HashMap для подсчета частоты слов
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Вывод уникальных слов и их частоты
        System.out.println("Уникальные слова и их частота:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}