

class Solution {
    // given arr, k

    // seen<-{0:1}, curr =0, count=0

    // for x in arr:
    // curr+= x
    // count += seen.get(curr-k, 0)
    // seen[curr]+= 1
    // return count

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> seen = new HashMap<>();

// Initialize with 0 seen once to handle subarrays starting from index 0
        seen.put(0,1);

        int cur =0;
        int count = 0;

        for(int x: nums){
            cur += x;
            // Add the number of times (cur - k) has appeared before
            count += seen.getOrDefault(cur-k,0);
            // Update the frequency of the current prefix sum
            seen.put(cur, seen.getOrDefault(cur, 0) + 1);
        }

        return count;
    }
}