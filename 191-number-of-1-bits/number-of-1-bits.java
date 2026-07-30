class Solution {
    public int hammingWeight(int n) {
        
// brute force method
        // int count = 0;
        // while(n!=0){

        //     if((n&1)==1){
        //         count++;
        //     }
        //     n>>>=1;
        // }
        // return count;

//n & n-1 approach
        int count =0;

        while(n != 0){

            n = n&(n-1);
            count++;
        }

        return count;

    }
}