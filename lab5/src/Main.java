import java.util.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1:");

        String[] wordArr = {"Стол", "Стул", "Кровать", "Лампа", "Компьютер", "Монитор", "Гитара", "Микрофон", "Камера", "Кресло", "Гитара", "Стол", "Гитара"};
        HashMap<String, Integer> wordList =  new HashMap<String, Integer>();
        for (String a : wordArr){
            wordList.merge(a, 1,(f,g) -> g+f);
        }
        System.out.println(wordList.entrySet());

        System.out.println("Задание2:");

        Telephone_book tp_bk = new Telephone_book();
        tp_bk.add("Арафайлов", "89127132227");
        tp_bk.add("арафайлов", "89127138888");
        tp_bk.add("арафайлов", "89127138888");
        tp_bk.add("арафайлов", "89127138800");

        tp_bk.add("петухов",   "89127138800");
        tp_bk.add("арафайлов", "89127138888");
        tp_bk.add("Петухов",   "89739834518");

        tp_bk.add("орлов",   "89127138867");
//        tp_bk.add("Петухов",   "89739834518");
//        tp_bk.add("Бузмаков",  "89693983124");
//        tp_bk.add("Батухтин",  "89531982835");
//        tp_bk.add("Зиновьев",  "89093922214");
//        //tp_bk.add("Макуц",     "89993305720");
//        tp_bk.add("Южакова",   "89993305720");
//        tp_bk.add("Орлов",     "89123578645");
//        tp_bk.add("Новосёлов", "89123578645");


//        System.out.println(tp_bk.get("Арафайлов"));
//        System.out.println(tp_bk.get("Петухов"));
//        System.out.println(tp_bk.get("арафайлов"));
//        System.out.println(tp_bk.get("петухов"));
//        System.out.println(tp_bk.get("Батухтин"));
//        System.out.println(tp_bk.get("Бузмаков"));
//        System.out.println(tp_bk.get("Макуц"));
//        System.out.println(tp_bk.get("Южакова"));
//        System.out.println(tp_bk.get("Орлов"));
//        System.out.println(tp_bk.get("Новосёлов"));

        tp_bk.printAll();
    }
}
