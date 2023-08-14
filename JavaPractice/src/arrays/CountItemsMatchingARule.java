package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == type i.
ruleKey == "color" and ruleValue == color i.
ruleKey == "name" and ruleValue == name i.
Return the number of items that match the given rule.
{{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}}
 */
public class CountItemsMatchingARule {
    public static void main(String[] args) {
        String[][] item = {{"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };
        //converting the 2D array to 2D List
        List<List<String>> items = Arrays.stream(item).map(Arrays::asList).toList();
        String ruleKey = "type";
        String ruleValue = "computer";
        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
//        System.out.println(Arrays.toString(items.toArray()));

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int column = 0;
        switch (ruleKey) {
            case "type":
                column = 0;
                break;
            case "color":
                column = 1;
                break;
            case "name":
                column = 2;
                break;
        }
        for (int row = 0; row < items.size(); row++) {
            if (items.get(row).get(column).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
