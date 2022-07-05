import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(100);
        myHashSet.add(20);
        myHashSet.add(-3);
        myHashSet.remove(100);
        System.out.println(myHashSet.contains(0));

        for (int i : myHashSet)
            System.out.println(i);
    }
}
