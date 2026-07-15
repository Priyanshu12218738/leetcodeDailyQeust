class Solution {
    public boolean isPowerOfTwo(int n) {

        // Powers of two must be strictly greater than zero
        if (n <= 0) {
            return false;
        }
        //check of n has exactly one set bit.
        //n & n-1 will be 0 only with power of two number
        return (n & (n - 1)) == 0;
    }
}
