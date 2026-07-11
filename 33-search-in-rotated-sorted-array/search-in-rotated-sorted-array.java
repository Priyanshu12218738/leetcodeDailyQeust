class Solution {
    public int search(int[] nums, int target) {
        int l =0 , r = nums.length -1;

        while(l<=r){

            //set mid variable
            int mid = l + (r-l)/2;

            if(target == nums[mid]){
                return mid;
            }

            // chceck in left
            if(nums[l]<= nums[mid]){
                
                if(target >= nums[l] && target < nums[mid]){
                        r = mid -1;
                }
                else{
                    l= mid +1;
                }
                
            }
            // check if right
            else {
                
                if(target > nums[mid] && target <= nums[r]){
                        l = mid +1;
                }
                else{
                    r = mid -1;
                }
            }
                
        }
        return -1;
    }
    }
