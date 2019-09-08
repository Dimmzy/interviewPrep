import java.util.*;

public class mostCommonString {

    public static String commonString(String[] arr) {
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            } else {
                hs.put(arr[i], 1);
            }
        }
        int currMax = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > currMax) {
                currMax = val;
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static void main (String[] args) {
        String arr[] = {"array", "loves", "programming", "programming", "love", "arr", "programm"};
        String sol  = commonString(arr);
        System.out.println(sol);
    }
}
