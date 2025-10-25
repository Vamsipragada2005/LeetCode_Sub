class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product =  1;
        int temp = Math.abs(n);
        while(temp>0){
            int digit  =  temp%10;
            sum+= digit;
            product *= digit;
            temp/=10;
        }
        return product - sum;
        
    }
}