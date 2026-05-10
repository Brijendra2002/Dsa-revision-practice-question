/**
 * Problem Name: Permutations
 * Language: Java
 */

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), answer);
        return answer;
    }

    private void backtrack(int index, int[] nums, List<Integer> path, List<List<Integer>> answer) {
        if (index == nums.length) {
            answer.add(new ArrayList<>(path));
            return;
        }

        backtrack(index + 1, nums, path, answer);
        path.add(nums[index]);
        backtrack(index + 1, nums, path, answer);
        path.remove(path.size() - 1);
    }
}
