class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int earliest = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            for(int j =0;j<m;j++){
                
                int landFinish=landStartTime[i]+landDuration[i];
                int waterStart = Math.max(landFinish,waterStartTime[j]);
                int waterFinish = waterStart + waterDuration[j];
                earliest = Math.min(earliest,waterFinish);

               
                int waterFinish2 = waterStartTime[j]+waterDuration[j];
                int landStart2 = Math.max(waterFinish2,landStartTime[i]);
                int landFinish2 = landStart2   + landDuration[i];
                earliest =  Math.min(earliest,landFinish2);

            }

        }
        return earliest;


        
    }
}