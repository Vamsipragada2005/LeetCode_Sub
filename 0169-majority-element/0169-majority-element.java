class Solution {
    public int majorityElement(int[] nums) {
        int co =0;
        int target = 0;
        for(int num:nums){
            if(co==0){
                target = num;
            }
            co += (num == target) ? 1: -1;
        }
        return target;

        
    }
}