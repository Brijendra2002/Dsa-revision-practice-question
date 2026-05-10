/**
 * Problem Name: Jump Game
 * Language: Java
 */

import java.util.*;

class Solution {
    public int solve(int[] nums, int target) {
        int left = 0;
        int best = 0;
        int windowSum = 0;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (left <= right && windowSum > target) {
                windowSum -= nums[left];
                left++;
            }

            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
