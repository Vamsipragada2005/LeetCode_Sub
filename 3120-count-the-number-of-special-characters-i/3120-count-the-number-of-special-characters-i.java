class Solution {
    public int numberOfSpecialChars(String word) {
     Set<Character> lowerset = new HashSet<>();
     Set<Character> upperset = new HashSet<>();
     for(char c : word.toCharArray()){
        if(Character.isLowerCase(c)){
            lowerset.add(c);
        }else{
            upperset.add(Character.toLowerCase(c));
        }
     }
     int count=0;
     for(char c : lowerset){
        if(upperset.contains(c)){
            count++;
        }
     }
     return count;
    }
}