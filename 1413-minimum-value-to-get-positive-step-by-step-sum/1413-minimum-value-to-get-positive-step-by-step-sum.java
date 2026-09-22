class Solution {
    public int minStartValue(int[] nums) {
        int cSum=0;
        int minSum =0;
        for(int num:nums){
            cSum+=num;
            minSum = Math.min(cSum,minSum);
        }
        return 1-minSum;
    }
}