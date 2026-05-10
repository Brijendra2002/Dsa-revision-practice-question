/**
 * Problem Name: Maximum Number of Balloons
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
