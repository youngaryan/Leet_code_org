import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        nums.add(num);

        num1.add(4);
        num1.add(5);
        num1.add(6);
        nums.add(num1);

        num2.clear();
        num2.add(7);
        num2.add(8);
        num2.add(9);
        nums.add(num2);

        System.out.println(new Solution().findDiagonalOrder(nums));
    }

}