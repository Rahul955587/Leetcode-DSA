class Solution {
    public int maxProduct(int n) {
        int maximum1=0,maximum2=0;
        while(n>0){
            int r=n%10;
            if(r>maximum1){
                maximum2=maximum1;
                maximum1=r;
            }
            else if(r>maximum2){
                maximum2=r;
            }
            n/=10;
        }
        return maximum1*maximum2;
    }
}