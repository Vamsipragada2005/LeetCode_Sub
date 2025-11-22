class Solution {
    public int minimumOperations(int[] nums) {
        int oper = 0;
        for(int num:nums){
            int remainder = num%3;
            if(remainder==1||remainder==2){
                oper+=1;
        
        }
        }
        return oper;
        
    }
}