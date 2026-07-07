class Solution {
    public int mostWordsFound(String[] sentences) {
        //set variable for max count
        int max = 0;

        //iter over sentences
        for(String s: sentences){
            int word = 1;
            for(char ch: s.toCharArray()){
                if(ch == ' '){
                    word++;
                }
            }
            max = Math.max(word, max);
        } 
        return max;
    }
}