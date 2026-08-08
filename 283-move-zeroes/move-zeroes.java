class Solution {
    public void moveZeroes(int[] nums) {
        //brute force with aux array.

        //two pointer.
        int slow =0;
        for(int fast = 0; fast<nums.length; fast++){

            // BUG 1 FIX: Check the value at nums[fast], not the index 'fast'
            if(nums[fast]!= 0){
                
                // BUG 2 FIX: Pass the array and indices, not the values
                swap(nums,fast, slow);
                slow++;
            }
        }

    }

    public void swap(int[] arr, int a, int b){
        
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
    }
}