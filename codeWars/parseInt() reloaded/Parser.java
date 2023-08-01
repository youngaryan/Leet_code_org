import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Parser {
    //"seven hundred eighty-three thousand nine hundred and nineteen" => 783919
    public static int parseInt(String numStr) {
        //thousend
        //hundred //tens
        int thousand = 1000;
        int hundred = 100;

        List<String> list = Arrays.asList("thousand","hundred");

        HashMap<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("zero", 0);
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        hashMap.put("six", 6);
        hashMap.put("seven", 7);
        hashMap.put("eight", 8);
        hashMap.put("nine", 9);
        hashMap.put("ten", 10);

        hashMap.put("twenty", 20);
        hashMap.put("thirty", 30);
        hashMap.put("forty", 40);
        hashMap.put("fifty", 50);
        hashMap.put("sixty", 60);
        hashMap.put("seventy", 70);
        hashMap.put("eighty", 80);
        hashMap.put("ninety", 90);

        hashMap.put("hundred", 100);
        hashMap.put("thousand", 1000);




        String[] numStringsArr = numStr.split("-"," ");
        
        System.out.println(Arrays.toString(numStringsArr));
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
    }
}