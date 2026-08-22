class Solution {
    public boolean checkDivisibility(int n) {
        int m=n,p=1,sum=0;
        while(m>0){
            int r=m%10;
            sum+=r;
            p*=r;
            m/=10;
        }
        return n%(sum+p)==0;
    }
}