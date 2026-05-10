/**
 * Problem Name: Network Delay Time
 * Language: Java
 */

import java.util.*;

class Solution {
    public int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num);
            if (heap.size() > k) heap.poll();
        }
        return heap.peek();
    }
}
