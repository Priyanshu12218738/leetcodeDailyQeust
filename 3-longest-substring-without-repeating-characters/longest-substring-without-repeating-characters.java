import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int L = 0;
        int maxLen = 0;
        int n = s.length();
        
        for (int R = 0; R < n; R++) {
            char currentChar = s.charAt(R);
            if (last.containsKey(currentChar) && last.get(currentChar) >= L) {
                L = last.get(currentChar) + 1;
            }
            last.put(currentChar, R);
            maxLen = Math.max(maxLen, R - L + 1);
        }
        
        return maxLen;
    }
}


