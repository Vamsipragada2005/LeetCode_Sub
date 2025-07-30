import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return result;

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(result, new StringBuilder(), digits, 0, digitToLetters);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, current, digits, index + 1, map);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
