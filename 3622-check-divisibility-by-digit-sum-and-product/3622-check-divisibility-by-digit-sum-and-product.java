class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n=n/10;

        }
        int div = sum+pro;
        if(div==0) return false;
        return org%div==0;
    }
}