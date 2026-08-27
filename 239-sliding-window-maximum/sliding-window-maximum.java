class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//case handling
        if(nums == null || nums.length == 0){
            return new int[0];
        }
//initializatin
         int n = nums.length;
         int[] ans = new int[n-k+1];
         int ansIdx = 0;

         Deque<Integer> dq = new ArrayDeque<>(); //indices store karne ke lia

// Loop (Har element par jana)
        for(int i=0; i< nums.length; i++){

//choti valuds ko piche se nikalna
            while (!dq.isEmpty() && nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();
            }
            
//naye element ka index push karna
            dq.offerLast(i);
        
//out of window elements ko aage se nikalna
            if(dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

// agar pehli window complete ho gayi hai toh anser save karna
            if(i >= k-1){
            ans[ansIdx++] = nums[dq.peekFirst()];
            }
        }
            return ans;
    }
    
}
