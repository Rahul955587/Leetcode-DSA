class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        for(int x:nums1) set1.add(x);
        HashSet<Integer>set2=new HashSet<>();
        for(int y:nums2) set2.add(y);
        List<Integer> list1=new ArrayList<>();
        for(int i:set1){
            if(!set2.contains(i)) list1.add(i);
        }
        List<Integer> list2=new ArrayList<>();
        for(int j:set2){
            if(!set1.contains(j)) list2.add(j);
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}