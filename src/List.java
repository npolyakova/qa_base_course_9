import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        // Создаём новый экземпляр ArrayList
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list); // => []

        // Добавляем элементы в список
        list.add("1");
        list.add(null);
        list.add(null);
        list.add("2");
        list.add("3");
        list.add("3");

        System.out.println(list); //=> [1, null, null, 2, 3, 3]

        list.remove(0);
        System.out.println(list); // => [null, null, 2, 3, 3]

        list.remove("3");
        list.remove("4");
        System.out.println(list); // => [null, null, 2, 3]

        System.out.println(list.size()); // => 4

        ArrayList<String> insertedList = new ArrayList<>();
        insertedList.add("1");
        insertedList.add("2");
        insertedList.add("7");
        insertedList.add("7");
        System.out.println(insertedList); // => [1, 2, 7, 7]

        list.addAll(2, insertedList);
        System.out.println(list); // => [null, null, 1, 2, 7, 7, 2, 3]

        System.out.println(list.indexOf("7")); // => 4
        System.out.println(list.get(3)); // => 2
        System.out.println(list.isEmpty()); // => false
        System.out.println(list.contains("2")); // => true
        System.out.println(list.contains("11")); // => false


        for (String s: list) {
            System.out.println("element of list: " + s);
        }
    }
}
