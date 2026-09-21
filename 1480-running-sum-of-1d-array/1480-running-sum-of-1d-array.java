class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        if(nums==null||nums.length==0){
            return new int[0];
        }
        int[] rSum = new int[n];
        rSum[0] = nums[0];
        for(int i=1;i<n;i++){
            rSum[i] = rSum[i-1]+nums[i];
        }
        return rSum;
        
    }
}