package lesson4;

import java.util.*;

public class HomeWork4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Италия", "Финляндия", "Норвегия", "Франция", "США", "Испания",
                "Канада", "Греция", "Испания", "Латвия", "Литва", "Болгария", "Польша", "Чехия");
        System.out.println("Исходный список:");
        list.forEach(System.out::println);

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : list) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(list);
        unique.forEach(System.out::println);
    }
}
