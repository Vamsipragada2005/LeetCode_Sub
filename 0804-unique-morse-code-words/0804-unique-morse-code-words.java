class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
             ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."

        };
        Set<String> uniqueTransform = new HashSet<>();
        for(String word : words){
            StringBuilder transform = new StringBuilder();
            for(char ch : word.toCharArray()){
                transform.append(morse[ch - 'a']);
            }
            uniqueTransform.add(transform.toString());
    }
    return uniqueTransform.size();
        
    }
}