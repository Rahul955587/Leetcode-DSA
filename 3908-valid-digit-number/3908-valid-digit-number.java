class Solution {
    public boolean validDigit(int n, int x) {
        boolean X=false;
        while(n>9){
            if(n%10==x) X=true;
            n/=10;
        }
        return X && n!=x;
    }
}