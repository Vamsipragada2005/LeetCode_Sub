class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            int digit =0;
            int temp = Math.abs(nums[i]);
            if(temp==0){
                digit=1;
            }else{
                while(temp>0){
                    temp/=10;
                    digit++;
                }
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
        
    }
}