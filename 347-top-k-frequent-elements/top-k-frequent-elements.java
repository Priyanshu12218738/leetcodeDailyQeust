import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count the frequency of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int x : nums) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        // 2. Create buckets where the index represents the frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // 3. Populate the buckets with values
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int frequency = entry.getValue();
            bucket[frequency].add(entry.getKey());
        }

        // 4. Gather the top k frequent elements into the primitive array
        int[] result = new int[k];
        int index = 0;

        for (int f = nums.length; f >= 1; f--) {
            if (!bucket[f].isEmpty()) {
                for (int val : bucket[f]) {
                    result[index++] = val;
                    // Stop once we have gathered k elements
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
