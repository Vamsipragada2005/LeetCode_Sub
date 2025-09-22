class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i<nums.length;i++){
        
            if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
                
            }else{
                map.put(nums[i],1);
            }
            max = Math.max(max,map.get(nums[i]));
        }
        int sum = 0;
        for(int num:map.keySet()){
            if(map.get(num)==max){
            sum+= map.get(num);
            }

        }
        if(map.size()==nums.length){
            return nums.length;
        }
        

        return sum;

       

        
    }
}