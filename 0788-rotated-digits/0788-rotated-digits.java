class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isGood(i)) count++;
        }
        return count;
    }
    private boolean isGood(int num){
        boolean changed=false;
        while(num>0){
            int r=num%10;
            if(r==3||r==4||r==7) return false;
            if(r==2||r==5||r==6||r==9) changed=true;
            num/=10;
        }
        return changed;
    }
}