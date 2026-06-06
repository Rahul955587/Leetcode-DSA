class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            int rsum=total-lsum-nums[i];
            arr[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return arr;
    }
}