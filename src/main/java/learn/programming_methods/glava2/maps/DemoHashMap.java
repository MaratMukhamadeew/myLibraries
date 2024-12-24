package learn.programming_methods.glava2.maps;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(3) {
            {
                this.put("Сырок",3);
                this.put("Пряник", 5);
                this.put("Молоко", 1);
                this.put("Хлеб", 1);
            }
        };
        System.out.println(map);
        map.put("Пряник", 4); // Замена или добавление при отсутствии ключа
        System.out.println(map + " После замены элемента");
        Integer a = map.get("Хлеб");
        System.out.println(a + " - найден по ключу\"Хлеб\"");
        // Вывод хэш-таблицы с помощью методов интерфейса Map.Entry<K, V>
        Set<Map.Entry<String, Integer>> setV = map.entrySet();
        System.out.println(setV);
        for (Map.Entry<String, Integer> me : setV) {
            System.out.println(me.getKey() + " - " + me.getValue());
        }
        Set<Integer> setI = new HashSet<>(map.values());
        System.out.println(setI);
    }
}
