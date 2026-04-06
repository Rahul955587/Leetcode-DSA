class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,sum=0;
        while(temp>0){
            int r=temp%10;
            sum=r+(sum*10);
            temp/=10;
        }
        if(sum==x) return true;
        else return false;
    }
}