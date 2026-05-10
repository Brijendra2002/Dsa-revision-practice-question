/**
 * Problem Name: Minimum Number of Taps to Open to Water a Garden
 * Language: Java
 */

import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int answer = 0;
        for (int value : nums) {
            answer = Math.max(answer, value);
        }
        return answer;
    }
}
