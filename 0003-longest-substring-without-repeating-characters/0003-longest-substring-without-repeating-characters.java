class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            boolean temp[]=new boolean[256];
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(temp[c]) break;
                temp[c]=true;
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}