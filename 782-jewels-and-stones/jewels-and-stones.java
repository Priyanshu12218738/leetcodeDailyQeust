class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // given
        HashSet<Character> j = new HashSet<>();        
        int count =0;
        //store 
        for(char c : jewels.toCharArray()){
            j.add(c);
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