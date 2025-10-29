class Solution {
    public int smallestNumber(int n) {
        int x = 1;
        while (x < n) {
            x = (x << 1) | 1;  
        }
        return x;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.smallestNumber(5));   
        System.out.println(sol.smallestNumber(10));  
        System.out.println(sol.smallestNumber(3));   
    }
}
