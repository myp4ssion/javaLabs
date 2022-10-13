import java.util.*;
import java.util.Locale;

public class Telephone_book {
    private Map<String, Set<String>> tpbk = new LinkedHashMap<>();

    public void add(String name, String number) {
        boolean rep = true;
        String s1 = name.substring(0, 1).toUpperCase() + name.substring(1);
        for (Set x : tpbk.values()) {
            if (x.contains(number)) rep = false;
        }
        if (rep) {
            if (tpbk.containsKey(s1)) {
                if (tpbk.get(s1).add(number) == false) {
                    System.out.println("Номер " + number + " уже существует, добавить невозможно.");
                }
            } else {
                tpbk.put(s1, new LinkedHashSet<>(Collections.singleton(number)));
            }
        } else {
            // System.out.println("Номер " + number + " уже существует, добавить невозможно.");
            System.out.println("Номер " + number + " уже существует, добавить невозможно.");
        }
    }

    Set<String> get(String Name) {
        System.out.print(Name + " : ");
        return tpbk.get(Name);
    }

    public void printAll() {
        for (Map.Entry<String, Set<String>> entry : tpbk.entrySet()) {
            System.out.println(entry.getKey()  + ": " + entry.getValue());
        }
    }
}