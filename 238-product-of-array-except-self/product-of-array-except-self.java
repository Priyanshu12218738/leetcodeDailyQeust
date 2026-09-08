class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        //pass 1: left to right(calculate prefix products)
        int prefix = 1;
        for(int i=0; i<n; i++){
            output[i] = prefix;
            prefix = prefix* arr[i];
        }

        //pass 2: right to left(multiply by suffix products)
        int suffix = 1;
        for(int i= n-1; i>= 0; i--){
            output[i] = output[i] * suffix;
            suffix = suffix * arr[i];

        }
        return output;
    }
}