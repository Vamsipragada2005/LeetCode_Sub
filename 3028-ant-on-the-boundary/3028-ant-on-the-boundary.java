class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int start =0;
        int cur=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
           
                cur+=nums[i];
            
            if(cur==start) cnt++;
        }
        return cnt;
         
        
    }
}