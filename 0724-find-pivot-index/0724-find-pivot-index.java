class Solution {
    public int pivotIndex(int[] nums) {
        int lSum=0;
        int tSum=0;
        int rSum;
      for(int i=0;i<nums.length;i++){
        tSum+=nums[i];
      }  
      for(int i=0;i<nums.length;i++){
        rSum=tSum-lSum-nums[i];
        if(lSum==rSum) return i;
        lSum+=nums[i];
      }
      return -1;

        
    }
}