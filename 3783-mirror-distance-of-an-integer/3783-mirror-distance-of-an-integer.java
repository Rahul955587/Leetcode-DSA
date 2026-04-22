class Solution {
    public int mirrorDistance(int n) {
        String rev=new StringBuilder(String.valueOf(n)).reverse().toString();
        int num=Integer.parseInt(rev);
        return Math.abs(n-num);
    }
}