class Solution {
    public int majorityElement(int[] nums) {
        
        int candidate=0;
        int count=0;

        for(int x : nums){
            if(count ==0 ){
                candidate = x;
                count += 1;
            }
            else if(x == candidate){
                count += 1;
            }
            else {
                count -= 1;
            }
        }

        return candidate;
    }
}