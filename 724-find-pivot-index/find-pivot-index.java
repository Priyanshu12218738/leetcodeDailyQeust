class Solution {
    public int pivotIndex(int[] nums) {
        // total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        //  running left sum 
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // RightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
