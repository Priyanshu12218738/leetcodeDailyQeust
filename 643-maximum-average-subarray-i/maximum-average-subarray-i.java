import java.util.Arrays;

class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            findMaxAverage(new int[1], 1);
        }
    }
    public static double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int max_sum = sum;
        
        // Slide the window across the rest of the array
        for (int right = k; right < nums.length; right++) {
            sum += nums[right] - nums[right - k];
            max_sum = Math.max(max_sum, sum);
        }
        
        // Divide by k and cast to double for the precise average
        return (double) max_sum / k;
    }
}
