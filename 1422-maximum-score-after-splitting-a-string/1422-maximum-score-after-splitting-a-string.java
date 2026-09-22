class Solution {
    public int maxScore(String s) {
     int maxsum=0;
        for(int i=1;i<s.length();i++){
            String left = s.substring(0,i);
            String right=s.substring(i);
        int Zcount=0;
        int oneCount=0;
        
        
            
        for(int j=0;j<left.length();j++){
            if(left.charAt(j)=='0') Zcount++;
        }
        for(int k=0;k<right.length();k++){
            if(right.charAt(k)=='1') oneCount++;
        }
        
        int cursum=Zcount+oneCount;
        maxsum=Math.max(cursum,maxsum);
        
        }
        return maxsum;
        
    }
}