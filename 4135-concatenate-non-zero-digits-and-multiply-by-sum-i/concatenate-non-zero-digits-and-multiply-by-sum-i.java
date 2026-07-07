class Solution { 
    public long sumAndMultiply(int n) { 
        long sum = 0; 
        long filteredNumber = 0; 
        long placeValue = 1; 

        // Handle edge case if n is 0
        if (n == 0) return 0; 

        while (n > 0) { 
            int digit = n % 10; 
            
            if (digit != 0) { 
                sum += digit; // Sums the non-zero digits
                
                // Rebuilds the number without zeroes from right to left
                filteredNumber = (digit * placeValue) + filteredNumber; 
                placeValue *= 10; 
            } 
            n /= 10; // Moves to the next digit
        } 
        return filteredNumber * sum; 
    } 
}
