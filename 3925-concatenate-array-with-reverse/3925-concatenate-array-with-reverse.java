class Solution {
    public int[] concatWithReverse(int[] nums) {
       int n=nums.length;
        int arr[]=new int[n*2];
        int i=0;
        for(int num:nums){
            arr[i++]=num;
        }
        for(int j=n-1;j>=0;j--){
            arr[i++]=nums[j];
        }
        return arr; 
    }
}