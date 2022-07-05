import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        System.out.println(queue.peek());

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}
