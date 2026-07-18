class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        // ob: only common bit(1)  take part in answer of left and right integer in range.
        int shift = 0; //// to keep track of common prefix shifts

        while(left != right){

            left >>= 1;
            right >>= 1;
            shift++;

        }
        return left << shift;
        
    }
}
// TC: O(1) Loop runs at most 32 times for 32-bit integers
// SC: O(1)