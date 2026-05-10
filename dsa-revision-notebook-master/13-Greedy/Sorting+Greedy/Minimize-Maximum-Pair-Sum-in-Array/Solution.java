/**
 * Problem Name: Minimize Maximum Pair Sum in Array
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
