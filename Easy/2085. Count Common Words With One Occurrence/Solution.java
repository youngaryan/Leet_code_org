import java.util.HashSet;

public class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        HashSet<String> remove1 = new HashSet<>();

        for(String s : words1) {
            if (!s1.contains(s) && !remove1.contains(s)) {
                s1.add(s);

            } else {
                s1.remove(s);
                remove1.add(s);
            }
        }


        System.out.println(s1);
        remove1.clear();
        System.out.println(remove1);
        for(String st : words2){
            if(s1.contains(st) && !remove1.contains(st)){
                s2.add(st);
                System.out.println(s2);
            }else {
                try {
                    s2.remove(st);
                    remove1.add(st);
                }catch (Exception e){}
            }
        }

        System.out.println(s2);
        return s2.size();
    }
}

