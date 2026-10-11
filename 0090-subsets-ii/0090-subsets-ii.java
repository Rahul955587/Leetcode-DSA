class Solution {
    private void subset(int ind,int arr[],List<List<Integer>>ans,List<Integer>temp){
        if(ans.contains(temp)) return;
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<arr.length;i++){
            temp.add(arr[i]);
            subset(i+1,arr,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        subset(0,nums,ans,new ArrayList<>());
        return ans;
    }
}