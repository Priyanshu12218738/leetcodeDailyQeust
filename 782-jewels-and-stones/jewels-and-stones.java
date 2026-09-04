class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // given
        HashSet<Character> j = new HashSet<>();        
        int count =0;
        //store 
        for(int i=0; i<jewels.length(); i++){
            j.add(jewels.charAt(i));
        }
        //check
        for(int i=0; i<stones.length(); i++){

            if(j.contains(stones.charAt(i))){
                count++;
            }


        }
        //return count
        return count;
    }
}