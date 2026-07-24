class Solution {
    public boolean isAnagram(String s, String t) {
        // anagram condition
        //same no of character
        if(s.length() != t.length()){
            return false;
        }
        // caaracter have same frequency
        //uing leaner data structure to store character
        int[] freq = new int[26];//no of alphabets

        for(int i=0; i<s.length(); i++){
            
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            
            freq[t.charAt(i) - 'a']--;
        }
        
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

}