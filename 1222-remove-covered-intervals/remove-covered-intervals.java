class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //sorting the intervals
        Arrays.sort(intervals, (a,b) -> {//by trigering ascending and descending
            if(a[0] == b[0]){
                return b[1]-a[1];   //triggers ascending, -ve return
            }
            return a[0] - b[0];     //triggers descending , +ve return.
        });

        int count =1;
        int maxEnd = intervals[0][1];

        //travers remainig intervals
        for(int i=0; i<  intervals.length; i++){

            //cover interval  check
            if(intervals[i][1]<=maxEnd){
                continue;
            }
            //new interval found 
            count++;
            maxEnd = intervals[i][1];
            
        }

        return count;
    }
}