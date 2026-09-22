class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] visited = new boolean[101];
        for(List<Integer> car:nums){
            int start = car.get(0);
            int end = car.get(1);
            for(int j=start;j<=end;j++){
                visited[j] = true;
            }
        }
        int count=0;
        for(int i=1;i<=100;i++){
            if(visited[i]) count++;
        }
        return count;
    }
}