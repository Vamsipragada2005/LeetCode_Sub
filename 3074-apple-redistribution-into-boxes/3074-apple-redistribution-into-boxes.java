class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int i =0;i<apple.length;i++){
            total+=apple[i];
        }
        Arrays.sort(capacity);
        int boxes= 0;
        int sum=0;
        for(int j=capacity.length-1;j>=0;j--){
            sum+= capacity[j];
            boxes++;
            if(sum>=total){
                break;
            }
        }
        return boxes;
        
    }
}