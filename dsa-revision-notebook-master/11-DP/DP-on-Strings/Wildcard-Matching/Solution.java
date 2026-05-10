/**
 * Problem Name: Wildcard Matching
 * Language: Java
 */

import java.util.*;

class Solution {
    public int tabulation(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 1]);
        }

        return dp[n];
    }
}
