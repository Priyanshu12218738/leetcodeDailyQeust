class Solution {
//     for i<- n-1 to 0:
//    if digit[i]<9: digit[i]+1; return digit
//     digit[i]<- 0;
// return [1]+ digits;
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length -1; i>=0; i--){
            if(digits[i]<9){
                digits[i]= digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigit = new int[digits.length +1];
        newDigit[0] =1;
        return newDigit;
    }
}