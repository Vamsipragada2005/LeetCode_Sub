class Solution {
    public boolean doesAliceWin(String s) {
         int count = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count > 0;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        
    }
}