
public class Solution {
    public int trap(int[] h) {
        if (h == null || h.length == 0) {
            return 0;
        }
        
        int left = 0;
        int right = h.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        
        while (left < right) {
            if (h[left] < h[right]) {
                if (h[left] >= leftMax) {
                    leftMax = h[left];
                } else {
                    total += leftMax - h[left];
                }
                left++;
            } else {
                if (h[right] >= rightMax) {
                    rightMax = h[right];
                } else {
                    total += rightMax - h[right];
                }
                right--;
            }
        }
        
        return total;
    }
}
