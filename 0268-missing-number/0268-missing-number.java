class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums) set.add(x);
        int max=Collections.max(set);
        for(int i=0;i<=max;i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }
}