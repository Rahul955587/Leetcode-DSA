class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set1=new HashSet<>();
        for(int x:nums1) set1.add(x);
        HashSet<Integer>set2=new HashSet<>();
        for(int y:nums2) set2.add(y);
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i:set1){
            if(set2.contains(i)) ar.add(i);
        }
        int arr[]=new int[ar.size()];
        int j=0;
        for(int num:ar){
            arr[j++]=num;
        }
        return arr; 
    }
}