class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");
        String str=arr[arr.length-1];
        return str.length();
    }
}