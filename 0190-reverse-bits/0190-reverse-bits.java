class Solution {
    public int reverseBits(int n) {
         int ans = 0;

            
            for (int i = 0; i < 32; i++) {
                int bit = (n >> i) & 1;

                if (bit == 1) {
                    ans |= (1 << (31 - i));
                }
            }

         return ans;
        }
        
    }
