import java.util.ArrayList;
import java.util.List;

public class LearnForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(num -> System.out.print(num + " "));
    }
}
