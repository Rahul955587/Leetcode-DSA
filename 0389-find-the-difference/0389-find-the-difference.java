class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char c:s.toCharArray()) res^=c;
        for(char r:t.toCharArray()) res^=r;
        return res;
    }
}