class Solution {
    public int getSum(int a, int b) {
        //sum as a^b , carry as overload bit
        

        while(b !=0){ //repeats the process until no carry remains.

            // << 1: shifts the carry bits left to add them to the next column.
            // a & b: finds matching set bits to determine the carry.
            int carry = (a&b)<<1; 

            a = a ^ b; //performs XOR addition, summing bits where there is no carry.
            b = carry;
        }
        return a;
    }
}