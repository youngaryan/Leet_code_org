import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int r = -1, count = 0;

        switch (ruleKey) {
            case "type":
                r = 0;
                break;
            case "color":
                r = 1;
                break;
            case "name":
                r = 2;
                break;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(r).equals(ruleValue))
                count++;
        }

        return count;
    }
}
