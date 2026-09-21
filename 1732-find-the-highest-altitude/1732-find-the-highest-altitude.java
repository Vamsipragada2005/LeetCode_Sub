class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n+1];
        alt[0] = 0;
        for(int i=1;i<=n;i++){
            alt[i] = alt[i-1]+gain[i-1];
        }
        int l=0;
        for(int i=0;i<alt.length;i++){
            if(alt[i]>l){
                l=alt[i];
            }

        }
        return l;

        
    }
}