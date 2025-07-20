import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(7);
        System.out.println(nums.get(2));
        nums.addFirst(1);
        nums.addLast(9);
        for (Integer num : nums) {
            System.out.println(num);
        }
        nums.clear();

    }
}
