import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> re = new ArrayList<>();
        int c = 1;
        while (n>c){
            if (c%15 == 0)re.add("FizzBuzz");
            else if (c%5 == 0) re.add("Buzz");
            else if (c%3 == 0) re.add("Fizz");
            else re.add(String.valueOf(c));
            c++;
        }

        return re;
    }
}
