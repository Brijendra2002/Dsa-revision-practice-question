/**
 * Problem Name: Number of Pairs of Strings With Concatenation Equal to Target
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
