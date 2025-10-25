class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letters = coordinates.charAt(0);
        char numbers = coordinates.charAt(1);
        int col = letters - 'a'+1;
        int row = numbers - '0';
        int sum = col+row;
        return sum%2 != 0;
        
    }
}