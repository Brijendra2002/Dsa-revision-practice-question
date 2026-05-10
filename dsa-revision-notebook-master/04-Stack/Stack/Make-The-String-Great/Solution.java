/**
 * Problem Name: Make The String Great
 * Language: Java
 */

import java.util.*;

class Solution {
    public int[] nextGreater(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                answer[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        return answer;
    }
}
