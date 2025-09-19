class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
            int sum = 0;
            for(int num: seen){
                if(!duplicate.contains(num)){
                    sum += num;

                }
            }
        return sum;
        
        
        
    }
}