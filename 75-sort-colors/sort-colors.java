class Solution {
    public void sortColors(int[] nums) {

        //brute force:coungitn sort(two pass)
        // better: two-pass partition 
        //dutch flag algo; in place , one swap       
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){

            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++; mid++;
            }

            else if(nums[mid]== 1 ){
                mid++;
            }

            else{
                swap(nums, mid, high);
                high--;
            } 

        }

   
        
    }

    public void swap(int[] num, int i, int j){
        //java changes when it is pass by value.

        int temp;
        temp = num[i];
        num[i]= num[j];
        num[j] = temp;

    }
}