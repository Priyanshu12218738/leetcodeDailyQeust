class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        int left =0;
        int right = numbers.length -1;

        while(left< right){

            int sum = numbers[left]+ numbers[right];
            
                
                if(numbers[left] + numbers[right]==target){
                    return new int[] {left+1, right +1}; //1 index responce
                }
                else if(sum < target){
                    left++;
                } 
                else{
                    right--;
                } 
            
        }
        return new int[] {-1, -1}; //fall back if no solution is found

    }
}