package algorithm.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 求字符串的无重复字符最长子串的长度
 *
 * eg: abcdabcdead  --->  5
 *
 * @author yinyuanyuan
 */

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
                System.out.println(j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return ans;
    }
}
