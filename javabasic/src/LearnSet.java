import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> hash_set = new HashSet<Integer>();
        hash_set.add(1);
        hash_set.add(3);
        hash_set.add(1);
        hash_set.add(5);
        hash_set.add(51);
        hash_set.add(28);
        hash_set.add(31);
        System.out.println("this is first loop");
        for (Integer num : hash_set) {
            System.out.println(num);
        } // HashSet is unordered, HashSet cannot get index

        // If u want to use a set that sorted, use TreeSet
        Set<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(11);
        tree_set.add(13);
        tree_set.add(1);
        tree_set.add(21);
        tree_set.add(7);
        tree_set.add(92);
        System.out.println("this is second loop");
        for (Integer num : tree_set) {
            System.out.println(num);
        }

        //Iterator in Set cannot use to read the collection in reverse way
        Iterator<Integer> it = hash_set.iterator();
        System.out.println("this is third loop");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
