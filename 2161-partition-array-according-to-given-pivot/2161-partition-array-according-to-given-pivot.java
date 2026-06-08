class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int r=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                nums[r++]=num;
            }
            else if(num==pivot){
                arr.add(0,num);
            }
            else arr.add(num);
        }
        for(int i=0;i<arr.size();i++){
            nums[r++]=arr.get(i);
        }
        return nums;
    }
}