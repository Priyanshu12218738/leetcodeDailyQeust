class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; // XOR with zero give iteslf

        for(int  num: nums){ // traverse through all element.
            ans ^= num; //do it in series, order doset matter. 

        }

        
        return ans;
    }
}