class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> kinds = new HashSet<>();

        for( int c : candyType){
            kinds.add(c);
        }
        return Math.min(kinds.size(), candyType.length/2);

    }
}