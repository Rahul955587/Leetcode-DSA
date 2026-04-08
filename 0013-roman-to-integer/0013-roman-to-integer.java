class Solution {
    public int romanToInt(String s) {
        char[]arr=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int val=roman(arr[i]);
            if(i<arr.length-1 && val<roman(arr[i+1])) sum-=val;
            else sum+=val;
        }
        return sum;
    }
    public int roman(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}