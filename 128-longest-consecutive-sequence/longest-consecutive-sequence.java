class Solution {
// set <- all numbers //O(n) 
// best <- 0

// for each n in set:
//   if n-1 in set: continue
//   length <-  1
//   while( n+ length) in set:
//     length++
//   best<- max(best,length)
// return best

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> cons = new HashSet<>();
        int best = 0;


        //store all integer in set
        for(int num : nums){
            cons.add(num);
        }

        //iterate over set-> skip elem having n-1 in set -> count length of other: consecutive integer
        for(int n : cons){
            
            if(!cons.contains(n-1)){

            int length =1;
            while(cons.contains(n + length)){
                length++;
            }

            best = Math.max(best, length);

            }

            

        }

        return best;


    }
}