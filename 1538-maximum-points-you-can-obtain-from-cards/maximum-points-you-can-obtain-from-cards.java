class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int total =0;
        for(int ele : cardPoints){
            total += ele;
        }

        int w = cardPoints.length - k;
        int winSum=0;
        for(int i=0; i<w; i++ ){
            winSum += cardPoints[i];
        } 

        int minSum =winSum;
        for(int r=w; r< cardPoints.length ; r++){
            winSum += cardPoints[r] - cardPoints[r-w];
            minSum = Math.min(winSum, minSum);
        }

        return total - minSum;

       

    }
}