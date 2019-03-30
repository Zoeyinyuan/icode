package algorithm.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubStringTest {

    private LongestSubString longestSubString = new LongestSubString();

    @Test
    public void testSameResult() {
        String testString = "adbadcdeab";
        int value =  longestSubString.lengthOfLongestSubstring(testString);
        assertEquals(value, 5);
    }
}
