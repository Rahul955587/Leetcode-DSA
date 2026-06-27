class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums) set.add(x);
        return n!=set.size();
    }
}