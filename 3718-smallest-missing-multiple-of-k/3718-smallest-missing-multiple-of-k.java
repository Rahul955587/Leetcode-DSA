class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int x:nums){
            arr.add(x);
        }
        for(int i=k;i<Integer.MAX_VALUE;i=i+k){
            if(!arr.contains(i)){
                return i;
            }
        }
        return -1;
    }
}