class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];  

     
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

       
        int maxVowel = 0;
        for (char v : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            maxVowel = Math.max(maxVowel, freq[v - 'a']);
        }

      
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if ("aeiou".indexOf(ch) == -1) {  
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        return maxVowel + maxConsonant;
    }
}
