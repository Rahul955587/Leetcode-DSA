class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        for(char i='a';i<='z';i++){
            if(set.contains(i) && set.contains(Character.toUpperCase(i))) count++;
        }
        return count;
    }
}