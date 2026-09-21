class Solution {
    public int[] leftRightDifference(int[] nums) {
       
        if(nums==null||nums.length==0){
            return new int[0];
        }
        int n = nums.length;
        int [] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0]=nums[0];
        suffixSum[n-1]=nums[n-1];

        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1]+nums[i];
        }
        int[] ans = new int[n];
        for(int i=0;i<prefixSum.length;i++){
            
                ans[i]=Math.abs(prefixSum[i]-suffixSum[i]);
                
        }
            return ans;
    }
}