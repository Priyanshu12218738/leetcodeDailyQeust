import java.util.HashSet;
class Solution {
    public char repeatedCharacter(String s) {
        //create a hashset to store character we hace seen
        HashSet<Character> set = new HashSet<>();

        //check every character in the string
        for(char ch : s.toCharArray()){
            //if character already exist, return it
            if(set.contains(ch)){
                return ch;
            }
            //otherwise, add the character to hashset
            set.add(ch);
        }

        return ' ';//for safety problem gurantees as answer.
    }
}