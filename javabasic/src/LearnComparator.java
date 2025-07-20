import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {
    public static void main(String[] args) {
        // Normal comparator

        Comparator<Integer> cmp1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        // Lambda comparator
        Comparator<Integer> cmp2 = (o1, o2) -> {
            if (o1 < o2) {
                return -1;
            }
            return 1;
        };
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(12);
        nums.add(1);
        nums.add(21);

        Collections.sort(nums, cmp1);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.sort(nums, cmp2);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
