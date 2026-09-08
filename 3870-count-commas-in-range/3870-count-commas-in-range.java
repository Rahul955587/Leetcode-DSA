class Solution {
    public int countCommas(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i);
            int m=s.length();
            if(m==4) c++;
            else if(m==5) c++;
            else if(m==6) c++;
        }
        return c;
    }
}