class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();


        // 1. Sort the array to use the two-pointer approach
        Arrays.sort(nums);
        
        // 2. Iterate through the array for the first element
        for(int i=0; i<nums.length-2; i++){

            // Skip duplicate values for the first element
            if(i>0 && nums[i] == nums[i-1]) continue;// removieg duplicates

            // 3. Initialize two pointers for the remaining window
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                 // Found a valid triplet, record it
                if(sum == 0){

                    // Found a valid triplet, record it
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Advance first
                    left++;
                    right--;
                    
                    // Then skip if the new element is identical to the old one
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                }else if (sum < 0) {
                    left++; // Sum is too small, move left pointer rightward
                } else {
                    right--; // Sum is too large, move right pointer leftward
                }

            }
        }
        return result;

    }
}